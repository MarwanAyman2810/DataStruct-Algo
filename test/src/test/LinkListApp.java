package test;

public class LinkListApp {
	public static Object insertLast(LinkList l, Object o) {
		LinkList tmp = new LinkList();
		while(!l.isEmpty())
			tmp.insertFirst(l.removeFirst());
		Object res = tmp.removeFirst();

		while(!tmp.isEmpty())
			l.insertFirst(tmp.removeFirst());
		return res;
	}
	public static LinkList reversa(LinkList list) {
		LinkList revlist = new LinkList();
		while (!list.isEmpty()) {
			revlist.insertFirst(list.removeFirst());
		}
		return revlist;
	}
	public static LinkList firstlast(LinkList list){
		LinkList after = new LinkList();
		while(!list.isEmpty()) {
			after.insertLast(list.removeFirst());
			if(!list.isEmpty())
				after.insertLast(list.removeLast());

		}
		//		while(!after.isEmpty())
		//			list.insertFirst(after.removeFirst());
		return after;
	}
	public static LinkList removeDuplicates(LinkList l) {
		LinkList m=new LinkList();
		m.insertLast(l.removeFirst());
		while(!l.isEmpty()) {

			if (!(m.getLast()==l.getFirst()))
				m.insertLast(l.removeFirst());

			else 
				l.removeFirst();
		}
		return m;
	}
	public static LinkList addOnes(LinkList l) {
		LinkList res=new LinkList();
		//int m = (int)l.removeFirst()+1;
		while(!l.isEmpty()) {

			res.insertLast((int)l.removeFirst()+1);
		}
		return res;
	}
	public static LinkList cut(LinkList l) {
		LinkList res= new LinkList();
		while(!l.isEmpty()) {
			res.insertLast(l.removeFirst());
			if (!l.isEmpty())
				res.insertFirst(l.removeLast());
		}
		return res;
	}
	public static void frontBackSplit(LinkList l) {

	}
	public static void main(String[] args) {
		// Create a new LinkList instance
		LinkList list = new LinkList();

		// Add some elements to the list
		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(3);
		list.insertLast(4);	
		list.insertLast(5);	
		list.insertLast(6);
		list.insertLast(7);
		// Display the list before insertion
		System.out.println("List before insertion: " + list);


		//LinkList n= insertLast(list, 4);
		//LinkList n=reversa(list);
		//LinkList n=firstlast(list);
		//LinkList n= removeDuplicates(list);
		//LinkList n= addOnes(list);
		LinkList n= cut(list);

		// Display the list after insertion
		System.out.println("List after insertion: " + n);
	}

}
