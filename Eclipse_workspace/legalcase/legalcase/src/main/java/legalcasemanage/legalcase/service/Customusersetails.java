package legalcasemanage.legalcase.service;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import legalcasemanage.legalcase.model.LoyerModel;

public class Customusersetails implements UserDetails {

    private LoyerModel loyermodel;

    public Customusersetails(LoyerModel loyermodel) {
        super();
        this.loyermodel = loyermodel;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // This is the place to ensure roles have "ROLE_" prefix if needed.
        // For example, if loyermodel.getRole() returns "LAWYER", but your
        // .hasRole() checks in SecurityConfig expect "ROLE_LAWYER":
        return List.of(new SimpleGrantedAuthority("ROLE_" + loyermodel.getRole()));
        // If your loyermodel.getRole() already stores "ROLE_LAWYER", then your original line was fine:
        // return List.of(new SimpleGrantedAuthority(loyermodel.getRole()));
    }

    @Override
    public String getPassword() {
        return loyermodel.getPassword(); // This is the encoded password from the DB
    }

    @Override
    public String getUsername() {
        return loyermodel.getEmail(); // This is the email (your login username)
    }

    // YOU MUST ADD THESE METHODS:
    @Override
    public boolean isAccountNonExpired() {
        return true; // Or implement your logic for account expiry
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Or implement your logic for account locking
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Or implement your logic for password expiry
    }

    @Override
    public boolean isEnabled() {
        return true; // Or implement your logic for enabling/disabling users
    }
}