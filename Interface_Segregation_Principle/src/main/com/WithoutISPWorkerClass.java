package main.com;
// Example violating ISP
interface WithoutISPWorkerClass {
    void work();
    void eat();
    void attendMeeting();
    void takeNotes();
}

class Manager implements WithoutISPWorkerClass {
    public void work() {
        // Manager's work logic
    }
    
    public void eat() {
        // Manager's eat logic
    }
    
    public void attendMeeting() {
        // Manager's meeting logic
    }
    
    public void takeNotes() {
        // Manager's note-taking logic
    }
}
