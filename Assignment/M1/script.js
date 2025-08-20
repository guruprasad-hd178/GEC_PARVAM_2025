let users = [];
let editingIndex = -1;

document.addEventListener("DOMContentLoaded", loadFromLocalStorage);

function createRecord() {
    if (!validateForm()) return;

    const user = getUserInput();
    if (editingIndex === -1) {
        users.push(user);
    } else {
        users[editingIndex] = user;
        editingIndex = -1;
    }
    saveToLocalStorage();
    resetForm();
    displayRecords();
}

function getUserInput() {
    const name = document.getElementById("name").value;
    const age = document.getElementById("age").value;
    const email = document.getElementById("email").value;
    const phone = document.getElementById("phone").value;
    const password = document.getElementById("password").value;
    const dob = document.getElementById("dob").value;
    const city = document.getElementById("city").value;
    const gender = document.querySelector('input[name="gender"]:checked')?.value || "";

    let skills = [];
    if (document.getElementById("html").checked) skills.push("HTML");
    if (document.getElementById("css").checked) skills.push("CSS");
    if (document.getElementById("js").checked) skills.push("JavaScript");

    const address = document.getElementById("address").value;

    return { name, age, email, phone, password, dob, city, gender, skills: skills.join(", "), address };
}

function displayRecords() {
    const tableBody = document.getElementById("tableBody");
    tableBody.innerHTML = "";

    users.forEach((user, index) => {
        tableBody.innerHTML += `
            <tr>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.email}</td>
                <td>${user.phone}</td>
                <td>${user.dob}</td>
                <td>${user.city}</td>
                <td>${user.gender}</td>
                <td>${user.skills}</td>
                <td>${user.address}</td>
                <td class="actions">
                    <button onclick="editRecord(${index})">Edit</button>
                    <button onclick="deleteRecord(${index})">Delete</button>
                </td>
            </tr>
        `;
    });
}

function editRecord(index) {
    const user = users[index];
    document.getElementById("name").value = user.name;
    document.getElementById("age").value = user.age;
    document.getElementById("email").value = user.email;
    document.getElementById("phone").value = user.phone;
    document.getElementById("password").value = user.password;
    document.getElementById("dob").value = user.dob;
    document.getElementById("city").value = user.city;
    document.querySelector(`input[name="gender"][value="${user.gender}"]`).checked = true;

    const skills = user.skills.split(", ");
    document.getElementById("html").checked = skills.includes("HTML");
    document.getElementById("css").checked = skills.includes("CSS");
    document.getElementById("js").checked = skills.includes("JavaScript");

    document.getElementById("address").value = user.address;
    editingIndex = index;
}

function deleteRecord(index) {
    users.splice(index, 1);
    saveToLocalStorage();
    displayRecords();
}

function resetForm() {
    document.getElementById("registrationForm").reset();
    editingIndex = -1;
}

function saveToLocalStorage() {
    localStorage.setItem("users", JSON.stringify(users));
}

function loadFromLocalStorage() {
    const storedUsers = localStorage.getItem("users");
    if (storedUsers) {
        users = JSON.parse(storedUsers);
        displayRecords();
    }
}

function validateForm() {
    const name = document.getElementById("name").value;
    const age = document.getElementById("age").value;
    const email = document.getElementById("email").value;
    const phone = document.getElementById("phone").value;
    const password = document.getElementById("password").value;
    const dob = document.getElementById("dob").value;
    const address = document.getElementById("address").value;

    if (!name || !age || !email || !phone || !password || !dob || !address) {
        alert("Please fill in all required fields.");
        return false;
    }
    return true;
}
