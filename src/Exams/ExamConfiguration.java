package Exams;

public class ExamConfiguration {
    private final String title;
    private final int duration;
    private final int passingScore;
    private final boolean negativeMarking;
    private final boolean questionShuffle;
    private final boolean autoSubmit;
    private final boolean calculatorAllowed;

    // Private constructor: outside classes cannot directly create ExamConfiguration.
    private ExamConfiguration(Builder builder) {
        this.title = builder.title;
        this.duration = builder.duration;
        this.passingScore = builder.passingScore;
        this.negativeMarking = builder.negativeMarking;
        this.questionShuffle = builder.questionShuffle;
        this.autoSubmit = builder.autoSubmit;
        this.calculatorAllowed = builder.calculatorAllowed;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public int getPassingScore() {
        return passingScore;
    }

    public boolean isNegativeMarking() {
        return negativeMarking;
    }

    public boolean isQuestionShuffle() {
        return questionShuffle;
    }

    public boolean isAutoSubmit() {
        return autoSubmit;
    }

    public boolean isCalculatorAllowed() {
        return calculatorAllowed;
    }

    public void displayConfiguration() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Passing Score: " + passingScore + " Marks");
        System.out.println("Configuration Profiles:");
        System.out.println((negativeMarking ? "✓" : "✗") + " Negative Marking Enabled");
        System.out.println((questionShuffle ? "✓" : "✗") + " Question Shuffle Activated");
        System.out.println((calculatorAllowed ? "✓" : "✗") + " Embedded Calculator Allowed");
        System.out.println((autoSubmit ? "✓" : "✗") + " Auto-Submit On Timeout");
    }

    public static class Builder {
        private String title;
        private int duration;
        private int passingScore;
        private boolean negativeMarking;
        private boolean questionShuffle;
        private boolean autoSubmit;
        private boolean calculatorAllowed;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder duration(int duration) {
            this.duration = duration;
            return this;
        }

        public Builder passingScore(int passingScore) {
            this.passingScore = passingScore;
            return this;
        }

        public Builder enableNegativeMarking() {
            this.negativeMarking = true;
            return this;
        }

        public Builder disableNegativeMarking() {
            this.negativeMarking = false;
            return this;
        }

        public Builder enableQuestionShuffle() {
            this.questionShuffle = true;
            return this;
        }

        public Builder disableQuestionShuffle() {
            this.questionShuffle = false;
            return this;
        }

        public Builder enableAutoSubmit() {
            this.autoSubmit = true;
            return this;
        }

        public Builder disableAutoSubmit() {
            this.autoSubmit = false;
            return this;
        }

        public Builder enableCalculator() {
            this.calculatorAllowed = true;
            return this;
        }

        public Builder disableCalculator() {
            this.calculatorAllowed = false;
            return this;
        }

        public ExamConfiguration build() {
            validate();
            return new ExamConfiguration(this);
        }

        private void validate() {
            if (title == null || title.trim().isEmpty()) {
                throw new IllegalArgumentException("Exam title cannot be empty.");
            }

            if (duration <= 0) {
                throw new IllegalArgumentException("Exam duration must be greater than 0.");
            }

            if (passingScore < 0) {
                throw new IllegalArgumentException("Passing score cannot be negative.");
            }
        }
    }
}