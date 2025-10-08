@NotesManagement
Feature: Notes Management on Evil Tester
  Create a feature file called notesManagement.
  feature that tests the note management functionality.

  * Add 10 different notes with unique titles
  * Verify each note is added successfully
  * Assert that all notes appear in the application
  * Create appropriate step definitions
  * Run tests and confirm all notes are displayed correctly

  Scenario: Add multiple notes and verify all are displayed
  Given user goes to "https://testpages.eviltester.com/styled/apps/notes/simplenotes.html"
  When user adds 10 different notes:
      | title                     | note |
      | Grocery List              | Milk, eggs, bread, spinach, chicken breast, peanut butter. Don't forget the dog food!                                |
      | Project X Meeting Summary | Decided on the blue color palette. Target launch date moved to Q4. Sarah will handle social media graphics.          |
      | Weekend Ideas             | Hiking at Bear Mountain, visit the new bookstore downtown, try that new ramen place, finish painting the guest room. |
      | Important API Key         | kja83ndhT47vBcZ90qLpA6wXrS2uEyD8gI5fO1hJ3mK4 (For testing only - never store real sensitive keys here!)              |
      | Book Recommendation       | 'The Martian' by Andy Weir. Fast-paced and scientifically interesting. Check the library for availability.           |
      | Car Maintenance Log       | Oil change at 85,000 miles. Tire rotation due in 3,000 miles. Replaced wiper blades on 9/28/2025.                    |
      | Future Feature Idea       | Add a dark mode toggle to the user profile settings. Need to test accessibility compliance for the new theme.        |
      | Favorite Quote            | 'The only way to do great work is to love what you do.' - Steve Jobs. A good reminder for Monday mornings.           |
      | Recipe: Simple Pasta      | Boil water, cook pasta (8 mins), sauté garlic in olive oil, toss pasta with sauce, top with basil and Parmesan.      |
      | Random Thoughts           | Why is the sky blue? Need to look up how to prune roses. Schedule a dentist appointment for next month.              |

    Then all notes should be visible in the list
    And user closes the browser
