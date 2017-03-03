# 리스트  (작성중)

1) 리스트의 사용 예시

* 어떤 리듬게임의 난이도 목록 : (Easy, Normal, Hard)
* 알파벳 모임 : (a, b, c, d, ..., z)
* 트위터 팔로잉/팔로워 목록



2) 리스트의 추상 데이터 타입 (ADT)

* 객체 : n개의 element형으로 구성된 순서 있는 컬렉션
* 메서드
  * add_last(list, item)
  * add_first(list, item)
  * add(list, pos, item)
  * delete(list, pos)
  * clear(list)
  * replace(list, pos, item)
  * is_in_list(list, item)
  * get_entry(list, pos)
  * get_length(list)
  * is_empty(list)
  * is_full(list)
  * display(list)



3) 리스트의 구현 방법

* 배열 (Array)
* 링크드 리스트 (Linked List)

Java의 경우는 ArrayList와 LinkedList가 제공되고 있다. (Vector도 있으나 현재는 ArrayList 사용을 권장)

참고 자료 : http://stackoverflow.com/questions/11375392/vector-vs-arraylist-which-is-better (mikera씨의 답변 참고)



## 배열 리스트

* 클래스 정의

```java
public class ArrayList {
    private final static int MAX_LIST_SIZE = 100; // 배열의 최대 크기
    private Object[] list = new Object[MAX_LIST_SIZE];
    private int length;

    public ArrayList (int length) {
        this.length = length;
        for (int index = 0; index < length; index++) {
            list[index] = 0;
        }
    }

    public ArrayList () {
        this.length = 0;
    }
}
```



* is_empty(list)

리스트가 비어있는지 확인한다. 비었을 경우 True, 그렇지 않을 경우 False를 반환.

```java
public boolean is_empty() {
    return this.length == 0;
}
```



* is_full(list)

리스트가 꽉 차있는지 확인한다. 꽉찼을 경우 True, 그렇지 않을 경우 False를 반환.

```java
public boolean is_full() {
    return this.length == MAX_LIST_SIZE;
}
```



* display(list)

리스트에 들어있는 값을 모두 표시한다.

```java
public void display() {
	int index;
	for(index = 0; index < this.length; index++) {
		System.out.println(this.list[index]);
	}
}
```



* add(list, position, item)

리스트의 특정 위치에 값을 추가한다. 해당 위치 이후에 있는 값들은 한칸 뒤로 이동된다.

```java
public void add(int position, Object item) {
    if(!is_full() && (position >= 0) && (position <= this.length)) {
    	int index;
    	for(index = this.length-1; index >= position; index--) {
      		this.list[index + 1] = this.list[index];
    	}

    	this.list[position] = item;
    	this.length++;
    }
}
```



* delete(list, position)

리스트의 특정 위치에 있는 값을 삭제한다. 해당 위치 이후에 있던 값들은 한칸 앞으로 이동된다.

```java
public Object delete(int position) {
    int index;
    Object item;

    if(position < 0 || position >= this.length) {
    	System.out.println("position error");
    }
    item = this.list[position];

    for(index = position; index < this.length-1; index++) {
    	this.list[index] = this.list[index + 1];
    }
    this.length--;

    return item;
}
```



## 링크드 리스트

* 클래스 정의

```java
public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    private class Node {
        private Object data;

        private Node next;
        public Node(Object input) {
            this.data = input;
            this.next = null;
        }
    }
}
```



* add_first(list, item)

```java
public void addFirst(Object input) {
    Node firstNode = new Node(input);
    firstNode.next = head;
    head = firstNode;

    size++;
    if(head.next == null) {
   	   tail = head;
    }
}
```



* add_last(list, item)

```java
public void addLast(Object input) {
    Node newNode = new Node(input);

    if(size == 0) {
    	addFirst(input);
    } else {
    	tail.next = newNode;
    	tail = newNode;
    	size++;
    }
}
```



* find(index)

```java
Node find(int index) {
    Node x = head;
    for (int i = 0; i < index; i++) {
        x = x.next;
    }
    return x;
}
```



* add(list, pos, item)

```java
public void addNode(Object input, int index) {
    Node newNode = new Node(input);
    Node currentNode = find(index-1);
    Node tempNode = currentNode.next;

    currentNode.next = newNode;
    newNode.next = tempNode;

    size++;
    if(newNode.next == null) {
   	   tail = newNode;
    }
}
```



* delete(list, pos)

```java
public Object deleteNode(int index) {
    if (index == 0) {
 	    return deleteFirst();
    }

    Node temp = find(index-1);
    Node currentNode = temp.next;
    temp.next = currentNode.next;

    Object returnData = currentNode.data;
    currentNode = null;
    size--;
    return returnData;
}
```



* delete_first(list)

```java
public Object deleteFirst() {
    Node temp = head;

    head = temp.next;
    Object returnData = temp.data;
    temp = null;
    size--;
    return returnData;
}
```



* size(list)

```java
public int size() {
	return this.size;
}
```





