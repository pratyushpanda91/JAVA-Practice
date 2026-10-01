//custom class  
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

//List
//arraylist
List<String> arrayList = new ArrayList<>();
arrayList.add("Apple");
arrayList.add("Banana");
System.out.println(arrayList); // Output: [Apple, Banana]

//linked list
List<String> linkedList = new LinkedList<>();
linkedList.add("Cat");
linkedList.add("Dog");
System.out.println(linkedList); // Output: [Cat, Dog]

//stack
Stack<Integer> stack = new Stack<>();
stack.push(1);
stack.push(2);
System.out.println(stack.pop()); // Output: 2

//vector
Vector<String> vector = new Vector<>();
vector.add("Red");
vector.add("Blue");
System.out.println(vector); // Output: [Red, Blue]

//set
//Hashset
Set<String> hashSet = new HashSet<>();
hashSet.add("One");
hashSet.add("Two");
System.out.println(hashSet); // Output: [One, Two]

//Treeset
Set<String> treeSet = new TreeSet<>();
treeSet.add("Cat");
treeSet.add("Dog");
System.out.println(treeSet); // Output: [Cat, Dog]

//Queue
//ArrayQueue
//Linkedlist queue
Queue<String> queue = new LinkedList<>();
queue.add("First");
queue.add("Second");
System.out.println(queue.poll()); // Output: First

//priorityqueue
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
priorityQueue.add(10);
priorityQueue.add(5);
System.out.println(priorityQueue.poll()); // Output: 5

//map
//hashmap
Map<String, Integer> hashMap = new HashMap<>();
hashMap.put("Apple", 10);
hashMap.put("Banana", 20);
System.out.println(hashMap); // Output: {Apple=10, Banana=20}

//treemap
Map<String, Integer> treeMap = new TreeMap<>();
treeMap.put("Orange", 5);
treeMap.put("Mango", 15);
System.out.println(treeMap); // Output: {Mango=15, Orange=5}

//Iterator
//listiterator
List<String> list = new ArrayList<>();
list.add("One");
list.add("Two");

ListIterator<String> iterator = list.listIterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}

//custom comparator
Collections.sort(people, new Comparator<Person>() {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.age - p2.age;
    }
});

//common algorithms
List<Integer> list = new ArrayList<>();
list.add(3);
list.add(1);
list.add(2);
Collections.sort(list);
System.out.println(list); // Output: [1, 2, 3]

List<Integer> list = new ArrayList<>();
list.add(3);
list.add(1);
list.add(2);
int max = Collections.max(list);
System.out.println(max); // Output: 3

int min = Collections.min(list);
System.out.println(min); // Output: 1

Collections.reverse(list);
System.out.println(list); // Output: [3, 2, 1]

int[] array = {3, 1, 2};
Arrays.sort(array);
System.out.println(Arrays.toString(array)); // Output: [1, 2, 3]

int frequency = Collections.frequency(list, 2);
System.out.println(frequency); // Output: 1

int index = Collections.binarySearch(list, 2);
System.out.println(index); // Output: 1 (index of 2 in sorted list [1, 2, 3])

double result = Math.pow(2, 3);
System.out.println(result); // Output: 8.0