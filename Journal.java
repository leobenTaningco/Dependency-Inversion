class Journal implements Resource {
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}

