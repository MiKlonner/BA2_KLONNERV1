package org.example;

public enum Role {
    ADMIN ("ADMIN"),
    GUEST ("GAST"),
    USER ("USER");




    private final String role;

    Role(String role) {
        this.role = role;
    }

    public static Role findByName(String name) {
        Role result = null;
        for (Role role : values()) {
            if (role.name().equalsIgnoreCase(name)) {
                result = role;
                break;
            }
        }
        return result;
    }

    public String getRole() {
        return this.role;
    }
    @Override
    public String toString() {
        return "Role{" +
                "role='" + role + '\'' +
                '}';
    }
}
