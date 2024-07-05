package main.com;
// Example following ISP
interface Worker {
    void work();
    void eat();
}

interface MeetingAttendee {
    void attendMeeting();
    void takeNotes();
}

class Managerr implements Worker, MeetingAttendee {
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
