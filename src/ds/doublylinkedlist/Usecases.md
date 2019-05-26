## doublylinkedlist usecases

* A great way to represent a deck of cards in a game
* The browser cache which allows you to hit the BACK button
  Each node contains a url and its tail pointer point's to next item's previous pointer, thus forming a linkedlist with two pointers
  next & previous, so when user hit back button the current node's previous pointer will refer to previous node and that url is hit 
  neatly referencing a doublylinkedlist. 
* Applications that have a Most Recently Used (MRU) list - 
* Undo & Redo functionality of any application using doubly linkedlist - It stores the previous operation in previous node with two
pointers next and previous, which also will store the next operation in next node with previous pointer refering to previous node and next
pointer refering to null . 
