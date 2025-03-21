package org.example.hospital;

import java.util.ArrayList;
import java.util.List;

public record Client(
        String ssn,
        String firstName,
        String lastName,
        int birthMonth,
        int birthDay,
        int birthYear,
        List<String> comments
) {
    public Client {
        comments = new ArrayList<>();
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public String toString(int indentLevel) {
        String indent = "\t".repeat(indentLevel);
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Client Information:\n");
        sb.append(indent).append("\tSSN: ").append(ssn).append("\n");
        sb.append(indent).append("\tName: ").append(firstName).append(" ").append(lastName).append("\n");
        sb.append(indent).append("\tBirth Date: ").append(birthMonth).append("/")
                .append(birthDay).append("/").append(birthYear).append("\n");
        if (comments.isEmpty()) {
            sb.append(indent).append("\tNo comments\n");
            return sb.toString();
        }
        sb.append(indent).append("\tComments:\n");
        for (String comment : comments) {
            sb.append(indent).append("\t\t- ").append(comment).append("\n");
        }
        return sb.toString();
    }

    public String toString() {
        return toString(0);
    }
}
