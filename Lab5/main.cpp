#include <iostream>
#include <cstdlib>
#include <string>
#include <vector>

using namespace std;

class stack {
    //class for the stack
public:
    int size;
    int top;
    char *arr;

    stack() {
        //Default constructor for the stack
        size = 300;
        top = -1;
        arr = new char[size];
    }

    bool isFull() {
        //function which check the stack is full or not.
        if (top == size - 1) {
            cout << "Full";
        }
        return top == size - 1;
    }

    bool isEmpty() {
        //function that check the function is empty.
        return top == -1;
    }

    void push(char value) {
        //function to push element in the stack
        if (isFull()) {
            cout << "This Stack is full";
        } else {
            top++;
            arr[top] = value;
        }
    }

    char pop() {
        //function to pop element from the stack.
        if (!isEmpty()) {
            top--;
            return arr[top + 1];
        } else {
            return '!';
        }
    }

    void clear() {
        //function to delete all entries
        delete[] arr;
    }

    void peak() {
        //function that print the top element of the stack.
        if (!isEmpty()) {
            cout<< arr[top]<<endl;
        }
    }
};

int main() {
    //Main function 
    //variable of string to take input from the user.
    string userinput;
    cout << "Enter the string to check: ";
    cin>>userinput;
    //Creating object of the stack
    stack *obj = new stack();
    
    //vector to store opening braces.
    vector<int> indexes;
    int fo = 0;//variable that check condition if string starts from closing braces.
    for (int i = 0; i < userinput.length(); i++) {
        //using for loop on the string given by the user.
        //condition that check for opening braces and storing it in the stack.
        if (userinput[i] == '(' || userinput[i] == '{' || userinput[i] == '[') {
            indexes.push_back(i);
            obj->push(userinput[i]);
            //IF the stack is not empty then checking on closing braces for the open braces
            // on the stack.. if found then pop that open braces.
        } else if (!obj->isEmpty()) {
            char temp = obj->pop();
            //this condition will find the starting braces for the closing braces.
            if ((userinput[i] == ')' && temp == '(') || (userinput[i] == '}' && temp == '{')
                    || (userinput[i] == ']' && temp == '[')) {
                indexes.pop_back();
               //this condition will run if starting braces not found.
            } else if (userinput[i] == ')' || userinput[i] == '}' || userinput[i] == ']') {
//                cout << " '" << userinput[i] << "' at index " << indexes.back() << " has not closing braces."<<endl;
                obj->push(temp);
                break;
            }else{
                obj->push(temp);
            }
            //This condition will run if the stack is empty and string start with closing braces.
        } else if (userinput[i] == ')' || userinput[i] == '}' || userinput[i] == ']') {
            cout << " '" << userinput[i] << "' at index " << indexes.back() << " has not closing braces."<<endl;
            fo=1;
            break;
        }
    }
    //if stack is empty. 
    if (obj->isEmpty() && fo ==0) {
        cout << "This expression is correct." << endl;
      //if the stack has some values.
    } else {
        cout << "This expression is NOT correct ";
        cout<<indexes[indexes.size()-1]+1<<", ";
        cout<<" has not closing braces";
    }
    return 0;
}
