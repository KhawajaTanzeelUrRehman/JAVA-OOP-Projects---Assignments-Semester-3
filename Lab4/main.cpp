/* C++ Program to Implement Circular Doubly Linked List
 */
#include<iostream>
#include<cstdio>
#include<cstdlib>
using namespace std;

/*
 * Class Declaration
 */
class DoubleCircularList {
public:
    int counter = 0;

    /*
     * Node Declaration
     */
    struct node {
        int info;
        struct node* next;
        struct node* prev;
    }
    *start, * last;

    DoubleCircularList() {
        start = NULL;
        last = NULL;
    }

    /*
     *CREATE NODE AND ALLOCATE MEMORY DYNAMICALLY
     */
    node* createNode(int value) {
        struct node* temp;
        //your code here
        temp = new node;
        temp->info = value;
        temp->next = NULL;
        temp->prev = NULL;
        return temp;
    }

    /*
     *INSERTS ELEMENT AT BEGINNING
     */
    void insertAtStart() {
        //This function will add the new element at start of the list.
        int value;
        cout << endl << "Enter the element to be inserted: ";
        cin>>value;

        //your code here

        node* n = createNode(value);
        if (start == NULL) { 
            //checking if the array is empty
            start = n;
            last = n;
            n->next = n;
            n->prev = n;
            counter++;//increasing number of elements in the array.
            
        } else {
            //If the list is not empty
            n->next = start;
            n->prev = last;
            start->prev = n;
            last->next = n;
            start = n;
            counter++;//increasing number of elements in the array.
        }

    }

    /*
     *INSERTS ELEMNET AT LAST
     */
    void insertLast() {
        //This function will add new elements at the end of the list.
        int value;
        cout << endl << "Enter the element to be inserted: ";
        cin>>value;

        //your code here
        node* n = createNode(value);
        if (start == NULL) {
            //if list is empty
            start = n;
            last = n;
            n->next = n;
            n->prev = n;
            counter++;//increasing number of elements in the array.
        } else {
            //if list has elements
            n->prev = last;
            n->next = start;
            last->next = n;
            start->prev = n;
            last = n;
            counter++;//increasing number of elements in the array.
        }



    }

    /*
     *INSERTS ELEMENT AT POSITION
     */
    void insertAtPos() {
        //This function will add new elements at the specific position.
        int value, pos;
        cout << endl << "Enter the element to be inserted: ";
        cin >> value;
        cout << endl << "Enter the position of element inserted: ";
        cin >> pos;

        //your code here
        node* n = createNode(value);
        if (pos >= 0 && pos <= counter + 1) {
            //Condition to check the given position is valid or not.
            if (start == NULL) {
                //if the list is empty.
                if (pos == 1) {
                    //if position is equal to 1
                    start = n;
                    last = n;
                    n->next = n;
                    n->prev = n;
                    counter++;//increasing number of elements in the array.
                }
            } else {
                //if the list is not empty.
                if (pos == 1) {
                    n->next = start;
                    n->prev = last;
                    start->prev = n;
                    last->next = n;
                    start = n;
                    counter++;//increasing number of elements in the array.
                } else if (pos == counter + 1) {
                    //Addition on the last of the list.
                    n->prev = last;
                    n->next = start;
                    last->next = n;
                    start->prev = n;
                    last = n;
                    counter++;//increasing number of elements in the array.
                } else {
                    // if list has elements and position is not first or last.
                    node* ptr = start;
                    int i = 1;
                    do {
                        i++;
                        ptr = ptr->next;

                    } while (i != pos);
                    n->next = ptr;
                    n->prev = ptr->prev;
                    ptr->prev->next = n;
                    ptr->prev = n;
                }
            }

        } else {
            cout << "Position is not valid";
        }
    }

    /*
     * Delete Node at Particular Position
     */
    void deleteAtPos() {
        //Function that will delete the elements from the specific position
        //in the list
        int pos, i;
        node* ptr, * s;
        if (start == last && start == NULL) {
            cout << "List is empty, nothing to delete" << endl;
            return;
        }
        cout << endl << "Enter the position of element to be deleted: ";
        cin >> pos;

        //your code here
        if (pos <= counter && pos > 0) {
            //position is valid.
            if (pos == 1) {
                //if the position is 1.
                if (counter == 1) {
                    // if the list has only one element.
                    delete start;
                    start = NULL;
                    last = NULL;
                    counter = 0;
                } else {
                    //position is 1 and list has multiple items.
                    start = start->next;
                    delete start->prev;
                    start->prev = last;
                    last->next = start;
                    counter--;
                }
            } else if (pos == counter) {
                //if position is last.
                start ->prev = last->prev;
                last->prev->next = start;
                delete last;
                last = start->prev;
                counter--;
            } else {
                //position is not last nor first
                i = 1;
                ptr = start;
                do {
                    i++;
                    ptr = ptr->next;

                } while (ptr != start && i != pos);
                if (i == pos) {
                    ptr->prev->next = ptr->next;
                    ptr->next->prev = ptr->prev;
                    delete ptr;
                }
            }
        }
        else {
            cout << "Position is not valid";
        }


    }

    /*
     * Display Elements of the List
     */
    void display() {
        //Function that display the items in the list.
        //your code here
        node* ptr = start;
        do {
            //Using do while loop and printing the elements in the list.
            if (counter == 0) {
                cout << "The list is Empty";
            } else {
                cout << ptr->info << ", ";
                ptr = ptr->next;
            }
        } while (ptr != start);
    }

};

/*
 * Main: Contains Menu
 */
int main() {
    int userChoice = 0;
    DoubleCircularList cdl;
    while (userChoice != 6) {
        cout << "\n-------------------------------" << endl;
        cout << "Operations on Doubly Circular linked list" << endl;
        cout << "\n-------------------------------" << endl;
        cout << "1.Insert at Beginning" << endl;
        cout << "2.Insert at Last" << endl;
        cout << "3.Insert at Specific Position" << endl;
        cout << "4.Delete at Specific Position" << endl;
        cout << "5.Display List" << endl;
        cout << "6.Exit" << endl;
        cout << "Enter your choice : ";
        cin >> userChoice;
        switch (userChoice) {
            case 1:
                cdl.insertAtStart();
                break;
            case 2:
                cdl.insertLast();
                break;
            case 3:
                cdl.insertAtPos();
                break;
            case 4:
                cdl.deleteAtPos();
                break;
            case 5:
                cdl.display();
                break;
            case 6:
                break;
            default:
                cout << "Wrong choice" << endl;
                break;
        }
    }
    return 0;
}