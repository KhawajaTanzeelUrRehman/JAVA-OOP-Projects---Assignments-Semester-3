#include <iostream>
#include <string>
#include <array>
using namespace std;

class patient {
private:
    static int autoid = 0;
public:
    string name;
    int id;

    patient() {
        cout << "Enter the name of the Patient: ";
        cin>>name;
        id = ++autoid;
    }
};

class management_system {
public:
    patient *arr;
    int front, rear;

    management_system() {
        arr = new patient[300];
        front = -1;
        rear = -1;
    }

    void RegisterPatient() {

    }

};

int main(int argc, char** argv) {
    management_system *a;
    a = new management_system();
    a->arr[0] = new patient();
    cout<<a.arr[0]->name;
    return 0;
}
