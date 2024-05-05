class Student {
    private ResourceRepository resourceRepository;

    public Student(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    public void borrowBook(String bookTitle) {
        Resource book = new Book(bookTitle);
        resourceRepository.borrowResource(book);
    }

    public void returnBook(String bookTitle) {
        Resource book = new Book(bookTitle);
        resourceRepository.returnResource(book);
    }

    public void borrowJournal(String journalTitle) {
        Resource journal = new Journal(journalTitle);
        resourceRepository.borrowResource(journal);
    }

    public void returnJournal(String journalTitle) {
        Resource journal = new Journal(journalTitle);
        resourceRepository.returnResource(journal);
    }
}