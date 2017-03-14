## 트리 (Tree)

* 트리란?

  * 비선형 자료구조
  * 요소를 계층적으로 저장하며, 최상위 요소(루트 노드)를 제외한 나머지 요소는 부모 / 자식 요소가 존재한다.
  * 일반 트리, 이진 트리, 이진 탐색 트리, AVL 트리, R-B 트리등 다양한 종류의 트리가 있다.

* 트리에서 사용하는 용어
   ```
   Root Node : 최상위 노드
   Parent Node : 어떤 노드의 상위 노드
   Child Node : 어떤 노드의 하위 노드
   Siblings Node : 어떤 노드와 같은 등급인 노드
   Leaf Node : Child Node가 존재하지 않는 노드
   Branch(Internal) Node : Root Node가 아니면서 Child Node가 존재하는 노드
   Degree : 노드의 Sub Tree 개수
   Depth : Root에서 특정 노드까지의 경로 길이
   ```
   그외 용어는 [링크](https://en.wikipedia.org/wiki/Tree_(data_structure)) 참조.

* 트리가 사용될 수 있는 예시

   * 파일 계층 구조 (디렉토리 / 파일)
   * 데이터베이스 (B-트리)



## 트리 구현

* ADT
  * getElement() : 이 위치에 저장된 요소를 반환한다.
  * root() : 트리의 루트 위치를 반환한다. 존재하지 않는 경우 null 반환.
  * parent(Position) : Position의 부모 노드 위치를 반환한다. Position이 루트 노드인 경우, null 반환.
  * children(Position) : Position의 자식 노드 목록을 반환한다.
  * numChildren(Position) : Position의 자식 노드 수를 반환한다.
  * isInternal(Position) : Position의 자식 노드 존재 여부를 체크한다. 1개 이상의 자식 노드가 존재하는 경우 true, 존재하지 않는 경우 false를 반환.
  * isExternal(Position) : Position이 자식 노드를 가지고 있지 않은지 체크한다. 가지고 있지 않은 경우 true, 가지고 있는 경우 false를 반환.
  * size() : 트리에 포함되는 노드 개수를 반환한다.
  * isEmpty() : 트리의 요소가 존재하는지 체크한다. 요소가 없는 경우 (트리가 비어있는 경우) true, 요소가 있는 경우 (트리가 비어있지 않은 경우) false를 반환.



## 이진 트리 (Binary Tree)

작성중