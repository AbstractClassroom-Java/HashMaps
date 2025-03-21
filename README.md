# Hospital Client Lookup System (Java)

This project demonstrates how to use a `HashMap` in Java to store and retrieve client information based on a unique key.  In this case, the unique key is the client's Social Security Number (SSN). 

---

## What is a HashMap?

A `HashMap` is a part of Java’s Collections Framework and provides a way to store data in **key-value pairs**.

- **Keys** must be unique (in this project, the SSN is used as the key).
- **Values** are associated with keys (here, each SSN maps to a `Client` object).
- `HashMap` allows **fast lookup**, **insertion**, and **deletion** operations, typically in constant time, O(1).
- The `HashMap` library is a generic class that can be initialized using the generic interface `Map`.
- The generic parameters are `HashMap<K,V>` where `K` is a class representing the key and `V` is a class representing the value.
- This example will relate `String` to a `Client` (a record class).

### HashMap Example

```java
Map<String, Client> map = new HashMap<>();
map.put("123-45-6789", someClient);
Client result = map.get("123-45-6789");
```

---

## Project Overview

### `Client` (record)

Represents a hospital client with the following fields:
- SSN
- First name and last name
- Birth date (month, day, year)
- List of comments

Includes:
- `addComment(String comment)`: Adds a new comment to the client.
- `toString(int indentLevel)`: Formats and returns the client's details with the specified indentation.
- `toString()`: A no-indentation version for convenience.

---

### `ClientLookup`

A helper class that:
- Stores clients in a `HashMap<String, Client>` using SSN as the key.
- Allows clients to be added (`addClient`) and retrieved (`lookUpClient`).

---

### `Main`

Demonstrates:
1. Creating multiple `Client` objects.
2. Adding comments to each client.
3. Storing them in the `ClientLookup` system.
4. Looking up clients by SSN and printing their details.

---

## Example Output

```
A Few Recent Clients:
	Client Information:
		SSN: 123-45-6789
		Name: Jane Smith
		Birth Date: 3/14/1985
		Comments:
			- Regular checkup.
			- Blood pressure is high but not a significantly.
			- Advised client to exercise more.

	Client Information:
		SSN: 987-65-4321
		Name: Mark Johnson
		Birth Date: 7/22/1978
		Comments:
			- Annual DOT physical completed.

	Client Information:
		SSN: 555-55-5555
		Name: Emily Davis
		Birth Date: 12/5/1992
		Comments:
			- Client fell asleep in lobby and missed appointment.
			- Follow-up visit next week.
```

---

## Notes

- Java `record` classes are **immutable** by default, but mutable fields like `List` can still be changed unless made unmodifiable.
- Using SSN as a key demonstrates how unique identifiers can be used for fast and precise lookups in a system.

---

## Package Structure

```
org.example
├── Main.java
└── hospital
    ├── Client.java
    └── ClientLookup.java
```

---

## How to Run

1. Compile all `.java` files:

   ```bash
   javac org/example/*.java org/example/hospital/*.java
   ```

2. Run the main program:

   ```bash
   java org.example.Main
   ```

---
