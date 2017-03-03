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

```java
public boolean is_empty() {
    return this.length == 0;
}
```



* is_full(list)

```java
public boolean is_full() {
    return this.length == MAX_LIST_SIZE;
}
```



* display(list)

```java
public void display() {
	int index;
	for(index = 0; index < this.length; index++) {
		System.out.println(this.list[index]);
	}
}
```



* add(list, position, item)

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





## 링크드 리스트

