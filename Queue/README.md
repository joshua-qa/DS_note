## 큐 (Queue)

* 큐?
  * 선입선출 방식의 자료구조
    * FIFO (First-In First-Out) 방식이라고 부른다.
  * 구현 방식에 따라 선형 큐 / 원형 큐로 구분되며, 스택과 큐를 합친 형태인 덱(Deque)이 있다.
  * 큐 자료구조를 활용한 우선순위 큐(Priority Queue)가 있다.
* 큐가 사용될 수 있는 예시
  * 운영체제 스케줄러 (프로세스 관리)
    * 예시) 프로세스들은 CPU자원을 사용하기 위해 큐에 줄을 서서 기다린다.
  * 각종 대기열
    * AOS 게임류에서 큐를 돌린다는 표현을 많이 사용하는데, 대기열에 줄을 서서 매칭을 기다리는 모습을 생각하면 된다.
    * 프린터의 출력 대기열
  * 윈도우 시스템의 메시지 처리기
  * GC (Garbage Collection)
    * 우선순위 큐를 사용한다.

### 스택 구현

* ADT

  * enqueue(Element)
    * 큐의 맨앞에 요소 Element를 추가한다.
  * dequeue()
    * 큐의 맨앞에 있는 Element를 제거하고, 들어있던 값을 반환한다. 큐가 비어있는 경우에는 null 반환.
  * first()
    * 큐의 맨앞에 있는 Element를 반환한다. 큐가 비어있는 경우에는 null 반환.
  * size()
    * 큐의 현재 길이(Element 개수)를 반환한다.
  * isEmpty()
    * 큐가 비어있는지 확인한다. 비어있는 경우 true, 비어있지 않은 경우 false 반환.

* 배열로 원형 큐를 구현하는 경우, 큐의 시작과 끝부분 사이에 한칸이 비어있어야 한다. 비어있는 상태와 꽉찬 상태를 구별할 수 있게 해주는 버퍼 역할을 한다.

* Java의 경우 java.util.Queue로 이미 큐가 구현되어 있으며, PriorityQueue 클래스도 이용할 수 있다.

  |    ADT     | java.util.Queue (throws exceptions) | java.util.Queue (returns special value) |
  | :--------: | :---------------------------------: | :-------------------------------------: |
  | enqueue(e) |               add(e)                |                offer(e)                 |
  | dequeue()  |              remove()               |                 poll()                  |
  |  first()   |              element()              |                 peek()                  |
  |   size()   |               size()                |                 size()                  |
  | isEmpty()  |              isEmpty()              |                isEmpty()                |

* LinkedList로 큐를 구현하는 경우 매우 쉽게 구현 가능하다. (LinkedListQueue.java 참고)



### Example


| 메서드        | 반환값   | 스택 내용물          |
| ---------- | ----- | --------------- |
| isEmpty()  | true  | ()              |
| enqueue(2) | -     | (2)             |
| enqueue(5) | -     | (2, 5)          |
| dequeue()  | 2     | (5)             |
| size()     | 1     | (5)             |
| enqueue(3) | -     | (5, 3)          |
| isEmpty()  | false | (5, 3)          |
| enqueue(9) | -     | (5, 3, 9)       |
| top()      | 5     | (5, 3, 9)       |
| enqueue(7) | -     | (5, 3, 9, 7)    |
| enqueue(6) | -     | (5, 3, 9, 7, 6) |
| dequeue()  | 5     | (3, 9, 7, 6)    |
| size()     | 4     | (3, 9, 7, 6)    |
| dequeue()  | 3     | (9, 7, 6)       |