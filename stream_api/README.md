## 1️⃣ What is Stream API?

The **Java Stream API** (introduced in Java 8) is used to process collections of objects **in a functional style**, without modifying the original data.

- Stream represents a **sequence of elements**.
- Supports **filtering, mapping, reducing, sorting, and collecting**.
- Works with **Collections, Arrays, I/O channels**, etc.
- **Not a data structure** — it doesn’t store data, it **operates on data**.

**Key Points:**
- Streams are **lazy** — computation happens only when a terminal operation is called.
- Streams **don’t modify the source** — they produce a new result.
- Streams can be **sequential** or **parallel**.

---

## 2️⃣ Stream Operations

Stream operations are of **two types**:

### a) Intermediate Operations
- Return a **Stream**, can be chained.
- Lazy — executed only when terminal operation is called.
- Examples: `filter()`, `map()`, `distinct()`, `sorted()`, `limit()`, `skip()`

### b) Terminal Operations
- Produce a **result** or **side-effect**
- Trigger stream processing.
- Examples: `collect()`, `forEach()`, `count()`, `reduce()`, `anyMatch()`, `allMatch()`

---

## 3️⃣ Creating Streams

```java
import java.util.*;
import java.util.stream.*;

public class StreamCreation {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c");

        // From Collection
        Stream<String> stream1 = list.stream();

        // From Array
        String[] arr = {"x","y","z"};
        Stream<String> stream2 = Arrays.stream(arr);

        // Using Stream.of()
        Stream<Integer> stream3 = Stream.of(1,2,3);

        // Infinite Stream using iterate
        Stream<Integer> infinite = Stream.iterate(1, n -> n+1).limit(5);
        infinite.forEach(System.out::println);
    }
}
```

---

## 4️⃣ Intermediate Operations

| Method                   | Description                      | Example                               |
| ------------------------ | -------------------------------- | ------------------------------------- |
| `filter(Predicate)`      | Keep elements matching condition | `stream.filter(n -> n>2)`             |
| `map(Function)`          | Transform elements               | `stream.map(String::length)`          |
| `mapToInt/Double/Long`   | Convert to primitive stream      | `stream.mapToInt(String::length)`     |
| `flatMap(Function)`      | Flatten nested streams           | `list.stream().flatMap(List::stream)` |
| `distinct()`             | Remove duplicates                | `stream.distinct()`                   |
| `sorted()`               | Sort elements (natural order)    | `stream.sorted()`                     |
| `sorted(Comparator)`     | Sort with comparator             | `stream.sorted((a,b)->b-a)`           |
| `peek(Consumer)`         | Debug / side-effect              | `stream.peek(System.out::println)`    |
| `limit(n)`               | Take first n elements            | `stream.limit(5)`                     |
| `skip(n)`                | Skip first n elements            | `stream.skip(2)`                      |
| `takeWhile(Predicate)`   | Take elements while true         | `stream.takeWhile(n->n<5)`            |
| `dropWhile(Predicate)`   | Drop elements while true         | `stream.dropWhile(n->n<5)`            |
| `unordered()`            | Allow unordered processing       | `stream.unordered()`                  |
| `concat(Stream, Stream)` | Combine two streams              | `Stream.concat(s1,s2)`                |

**Example:**

```java
List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

// Filter even numbers
List<Integer> even = nums.stream().filter(n -> n % 2 == 0).toList();
System.out.println("Even: " + even);

// Map to squares
List<Integer> squares = nums.stream().map(n -> n*n).toList();
System.out.println("Squares: " + squares);

// Distinct
List<Integer> duplicates = Arrays.asList(1,2,2,3,3,3);
List<Integer> distinct = duplicates.stream().distinct().toList();
System.out.println("Distinct: " + distinct);

// Sorted descending
List<Integer> sorted = nums.stream().sorted((a,b)->b-a).toList();
System.out.println("Sorted Desc: " + sorted);

// Limit & Skip
List<Integer> first3 = nums.stream().limit(3).toList();
List<Integer> skip2 = nums.stream().skip(2).toList();
System.out.println("First 3: " + first3 + ", Skip 2: " + skip2);
```

---

## 5️⃣ Terminal Operations

| Method                             | Description                  | Example                                                 |
| ---------------------------------- | ---------------------------- | ------------------------------------------------------- |
| `forEach(Consumer)`                | Iterate elements             | `stream.forEach(System.out::println)`                   |
| `forEachOrdered(Consumer)`         | Ordered iteration (parallel) | `stream.parallel().forEachOrdered(System.out::println)` |
| `toArray()`                        | Collect to array             | `Object[] arr = stream.toArray();`                      |
| `reduce(BinaryOperator)`           | Combine elements             | `stream.reduce((a,b)->a+b)`                             |
| `reduce(identity, BinaryOperator)` | Reduce with identity         | `stream.reduce(0,(a,b)->a+b)`                           |
| `collect(Collector)`               | Collect to collection/map    | `stream.collect(Collectors.toList())`                   |
| `min(Comparator)`                  | Minimum element              | `stream.min(Integer::compare)`                          |
| `max(Comparator)`                  | Maximum element              | `stream.max(Integer::compare)`                          |
| `count()`                          | Count elements               | `stream.count()`                                        |
| `anyMatch(Predicate)`              | True if any match            | `stream.anyMatch(n->n>5)`                               |
| `allMatch(Predicate)`              | True if all match            | `stream.allMatch(n->n>0)`                               |
| `noneMatch(Predicate)`             | True if none match           | `stream.noneMatch(n->n<0)`                              |
| `findFirst()`                      | First element (Optional)     | `stream.findFirst()`                                    |
| `findAny()`                        | Any element (Optional)       | `stream.findAny()`                                      |
| `iterator()`                       | Get iterator                 | `stream.iterator()`                                     |
| `spliterator()`                    | Get Spliterator              | `stream.spliterator()`                                  |

**Example:**

```java
List<Integer> nums = Arrays.asList(1,2,3,4,5);

// forEach
nums.stream().forEach(System.out::println);

// Count
long count = nums.stream().filter(n -> n > 3).count();
System.out.println("Count > 3: " + count);

// Reduce sum
int sum = nums.stream().reduce(0, Integer::sum);
System.out.println("Sum: " + sum);

// Match operations
boolean allEven = nums.stream().allMatch(n -> n % 2 == 0);
boolean anyEven = nums.stream().anyMatch(n -> n % 2 == 0);
boolean noneNegative = nums.stream().noneMatch(n -> n < 0);
System.out.println("All even: "+allEven+", Any even: "+anyEven+", None negative: "+noneNegative);

// Find first
Optional<Integer> first = nums.stream().findFirst();
first.ifPresent(f -> System.out.println("First: "+f));
```

---

## 6️⃣ Collectors

| Method                                                | Description            | Example                                                                   |
| ----------------------------------------------------- | ---------------------- | ------------------------------------------------------------------------- |
| `Collectors.toList()`                                 | Collect to List        | `stream.collect(Collectors.toList())`                                     |
| `Collectors.toSet()`                                  | Collect to Set         | `stream.collect(Collectors.toSet())`                                      |
| `Collectors.toMap(keyMapper,valueMapper)`             | Collect to Map         | `stream.collect(Collectors.toMap(String::toLowerCase, String::length))`   |
| `Collectors.joining(delimiter)`                       | Join strings           | `stream.collect(Collectors.joining(", "))`                                |
| `Collectors.groupingBy(classifier)`                   | Group by key           | `stream.collect(Collectors.groupingBy(String::length))`                   |
| `Collectors.partitioningBy(predicate)`                | Partition by boolean   | `stream.collect(Collectors.partitioningBy(s->s.length()>3))`              |
| `Collectors.counting()`                               | Count elements         | `stream.collect(Collectors.counting())`                                   |
| `Collectors.summarizingInt/Double/Long`               | Summary statistics     | `stream.collect(Collectors.summarizingInt(String::length))`               |
| `Collectors.reducing(identity,mapper,BinaryOperator)` | Custom reduction       | `stream.collect(Collectors.reducing(0,String::length,Integer::sum))`      |
| `Collectors.maxBy(Comparator)`                        | Max element            | `stream.collect(Collectors.maxBy(Integer::compare))`                      |
| `Collectors.minBy(Comparator)`                        | Min element            | `stream.collect(Collectors.minBy(Integer::compare))`                      |
| `Collectors.mapping(mapper,downstream)`               | Transform then collect | `stream.collect(Collectors.mapping(String::length, Collectors.toList()))` |

**Example:**

```java
List<String> names = Arrays.asList("Alice","Bob","Charlie","David");

// toList
List<String> list = names.stream().filter(s->s.length()>3).toList();
System.out.println("List: "+list);

// toSet
Set<String> set = names.stream().collect(Collectors.toSet());
System.out.println("Set: "+set);

// joining
String joined = names.stream().collect(Collectors.joining(", "));
System.out.println("Joined: "+joined);

// groupingBy
Map<Integer,List<String>> group = names.stream().collect(Collectors.groupingBy(String::length));
System.out.println("Grouped by length: "+group);

// partitioningBy
Map<Boolean,List<String>> part = names.stream().collect(Collectors.partitioningBy(s->s.length()>3));
System.out.println("Partitioned by length>3: "+part);
```

---

## 7️⃣ Primitive Streams

| Method                               | Description                         |
| ------------------------------------ | ----------------------------------- |
| `mapToInt / mapToDouble / mapToLong` | Convert objects to primitive stream |
| `sum()`                              | Sum all elements                    |
| `average()`                          | Average as OptionalDouble           |
| `min()`                              | Minimum element                     |
| `max()`                              | Maximum element                     |
| `summaryStatistics()`                | Returns IntSummaryStatistics        |
| `range(start,end)`                   | Stream of ints in range (exclusive) |
| `rangeClosed(start,end)`             | Stream of ints in range (inclusive) |

**Example:**

```java
List<String> names = Arrays.asList("Alice","Bob","Charlie");

// Map to int length
IntStream lengths = names.stream().mapToInt(String::length);
lengths.forEach(System.out::println);

// Summary statistics
IntSummaryStatistics stats = names.stream().mapToInt(String::length).summaryStatistics();
System.out.println("Max: "+stats.getMax()+", Average: "+stats.getAverage());
```

---

## 8️⃣ Parallel Streams

* `parallelStream()` → create parallel stream from collection  
* `parallel()` → convert sequential stream to parallel  
* `sequential()` → convert parallel stream to sequential  
* Use `forEachOrdered()` for ordered results in parallel streams.

**Example:**

```java
List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

// Parallel sum
int sum = nums.parallelStream().reduce(0, Integer::sum);
System.out.println("Parallel Sum: "+sum);

// Ordered forEach
nums.parallelStream().forEachOrdered(System.out::println);
```

---

## 9️⃣ Real-Life Examples

### a) First Non-Repeating Character

```java
String str = "swiss";
Optional<Character> firstNonRepeat = str.chars()
                                        .mapToObj(c -> (char)c)
                                        .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
                                        .findFirst();
firstNonRepeat.ifPresent(System.out::println); // w
```

### b) Top 3 Salaries

```java
List<Integer> salaries = Arrays.asList(40000,50000,60000,45000);
List<Integer> top3 = salaries.stream()
                             .sorted(Comparator.reverseOrder())
                             .limit(3)
                             .toList();
System.out.println(top3); // [60000, 50000, 45000]
```

### c) Flatten Nested List

```java
List<List<String>> nested = Arrays.asList(
    Arrays.asList("a","b"),
    Arrays.asList("c","d")
);
List<String> flat = nested.stream()
                          .flatMap(List::stream)
                          .toList();
System.out.println(flat); // [a,b,c,d]
```



## 🔟 Pro Tips for Java Streams

1. 💡 **Immutable Operations** – Avoid modifying the collection while streaming. Streams are **functional**.
2. 🎯 **Use Method References** – Cleaner code: `String::length`, `System.out::println`.
3. 🕰️ **Lazy Evaluation** – Intermediate operations are executed **only** when a terminal operation is called.
4. 🔍 **Debugging with peek()** – Inspect elements without altering the stream.
5. ♾️ **Be Careful with Infinite Streams** – Always use `limit()` to avoid endless loops.
6. ⚡ **Parallel Streams** – Can improve performance, but **test** sequential vs parallel; not always faster.
7. 📌 **Short-Circuit Operations** – `findFirst()`, `anyMatch()` stop processing once the condition is met.
8. 🧩 **Combine Operations Smartly** – Chain operations logically: filter → map → collect.
9. 🧪 **Optional Handling** – Terminal operations like `findFirst()` return Optional; handle properly.
10. 🛠️ **Collectors Are Powerful** – Use `groupingBy`, `partitioningBy`, `joining` for advanced results.

---

If you want, I can **also make the entire README visually consistent**, adding emojis, highlights, and separators to make it **look like a professional GitHub guide**.

Do you want me to do that next?

---

## ✅ References

* [Official Java Docs – Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)  
* [Oracle Tutorial – Streams](https://docs.oracle.com/javase/tutorial/collections/streams/)  

---

*This README provides a **complete reference for Java Stream API**, including creation, intermediate and terminal operations, collectors, primitive streams, parallel streams, and real-world examples.*

