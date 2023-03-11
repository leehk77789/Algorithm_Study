package test02;

public class SingltLinkedList {
	// 연결 리스트는 head만 저장하고 있으면 됨
	public Node head;

	public SingltLinkedList() {
	}

	// 연산을 구현해야한다
	// 가장 마지막에 추가 : addToEnd
	// 특정 값을 갖는 노드 다음에 추가 : addAfter
	// 특정 값을 갖는 노드를 반환 : getNode
	// 가장 마지막에 있는 노드 삭제 : deleteLast
	// 가장 처음에 있는 노드 삭제 : deleteStart
	// 특정 값을 갖는 노드 다음 노드 삭제 : deleteAfter
	// 리스트를 순회해서 출력 : printList

	public void addToEnd(int data) {
		// 새로운 노드를 생성
		Node n = new Node(data);

		// 가장 마지막 노드 찾기
		if (head == null) {// 리스트가 비어있다면
			head = n;
		} else {// 가장 마지막 노드 찾기
			Node curr = head; // 임시 변수 curr에 가장 첫번째 노드의 주소값을 저장해 놓고 시작
			while (curr.next != null) {// 다음 노드가 있다면
				curr = curr.next; // 다음 노드로 이동
			}
			// while문이 끝났다면?
			// curr.next == null
			// curr => 가장 마지막 노드를 가리키고 있는 상태

			// 가장 마지막 노드의 다음에 새로운 노드를 추가
			curr.next = n;
		}
	}

	public void addToStart(int data) {
		// 새로운 노드 만들기
		Node n = new Node(data);

		// 현재 첫번째 노드는 head를 통해서만 접근 가능
		// 현재 첫번째 노드는 두번째 노드가 되어야 함
		// 새로운 노드.next = 현재 첫번째 노드의 주소값(head)
		n.next = head;

		// head가 새로운 노드 가르키도록 하기
		// head <= 새로운 노드의 주소값
		head = n;
	}

	// target이라는 값을 갖는 노드의 주소값을 반환
	public Node getNode(int target) {
		Node curr = head;
		while (curr != null) {
			if (curr.data == target) {
				return curr;
			}
			curr = curr.next;
		}
		return null; // 다 돌아도 노드를 찾지 못했다면, null을 반환한다.
	}

	// target이라는 값을 갖는 노드를 찾아서
	// 그 다음에 data라는 값을 갖는 노드 삽입
	public void addAfter(int target, int data) {
		Node targetNode = getNode(target);
		if (targetNode != null) { // 노드를 찾았다면
			Node n = new Node(data);
			n.next = targetNode.next;
			targetNode.next = n;
		}
	}

	public void printList() {
		Node curr = head;
		System.out.print("LinkedList[head : ");

		while (curr != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.next;
		}
		System.out.println("]");
	}
}
