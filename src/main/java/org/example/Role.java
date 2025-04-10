package org.example;

public enum Role {
    ADMIN ("ADMIN"),
    GUEST ("GAST"),
    USER ("USER");




    private final String role;

    Role(String role) {
        this.role = role;
    }
    public String getRole(Role role) {
        return this.role;
    }
    @Override
    public String toString() {
        return "Role{" +
                "role='" + role + '\'' +
                '}';
    }
}
