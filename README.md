# Assignment 1

## Released on the 12th of September and due on the 23rd of September. Completed individually and weighted at 10% of the course grade. Solution is to be typeset, professionally presented, and submitted to the appropriate drop box on eConestoga. Late solutions are accepted, with a penalty of 20% per day.

#### 0. [1 point] Academic honesty is important to us. As a student, you are expected to understand the college’s academic integrity policy (which you may study at https://lib.conestogac.on.ca/academic-integrity). If you have read and agree with the academic integrity policy, then write the following as your solution
to this assignment task: “I have read and understood what constitutes an academic incident and will avoid any activities that may lead to an
academic incident.” Remember this policy when working on this and any future academic assessment.

#### 1. [2 points] For all of the web pages in this assignment include an attractive css template style that deploys a grid CSS style approach. You will receive one point for using grid style and one point for attractiveness.
#### The following tasks will allow you to practice your algorithmic problem solving skills by writing elementary programs in Java. All of your functions should be deployed as part of a basic web service using a Spring Application setup.

#### 2. [4points] A palindrome is a string that equals its reverse. For example, the strings, “abba” and “racecar”, are palindromes
but the string, “prog8610”, is not a palindrome. 
##### a. Write a method 
#####    that returns true if the given string is a palindrome, or false otherwise.
##### b. Write a complete set of unit tests to prove your function works as expected.
##### c. Use Spring to display the output of the function for the http call on
#####    localhost:8080/palindrome/{string}

#### 3. [4 points] Web clients request pages from servers using a URL. 
####    e.g. https://www.conestogac.on.ca/index.jsp.
####    URLs are represented and transmitted over the Internet using ASCII; and URL encoding is the conversion of a non-ASCII characters into ASCII, commonly known as percent-encoding.
##### a. Write a method that accepts a string and performs a simplified percent-encoding by replacing space characters with %20.
##### b. Write a complete set of tests to prove your function works as expected.
##### c. Use Spring to display the output of the function for the http call on localhost:8080/ascii?url={parameter_string}

#### 4. [4 points]
##### a. Write a method that accepts two strings, s1 and s2, and returns true if s2 is a substring of s1, or false otherwise.
##### b. Write a complete set of tests that prove your function works as expected.
##### c. Use Spring to display the output of your function for an http call on localhost:8080/substring?s1={string1}&s2={string2}

#### 5. [12 points]
##### a. Write a method that returns the transpose of a given matrix. Recall that that the transpose matrix operation switches the row and column indices.
e.g. the transpose of [
                        0 1
                        2 3
                      ] is 
                      [
                        0 2
                        1 3
                      ].
##### b. Write a complete set of tests that prove your function works as expected.
##### c. Create a form with that allows a user to input values into a 2 x 2 table and on submit will use your function to output the transposed matrix to the same page. You may use either JavaScript or Thymeleaf to achieve this objective.
##### d. Hint: You will need to use an http POST request call to complete this section.

#### 6. [4 points]
##### a. Write a method that returns true if the provided string contains entirely unique characters, or false otherwise.
##### b. Write a complete set of tests that proves your function works as expected.
##### c. Use Spring to display the output of your function for an http call on localhost:8080/substring/{string}

#### 7. [12 points]
##### a. Write a brief web application that illustrates the following GRASP pattern approaches to using and creating objects in Java when a user launches the uri, `http://localhost:8080/grasp. You should use Thymeleaf and the Model object in Spring to add your information to the web page template.
##### b. Provide two sentences with a brief explanation about the fundamental purpose of GRASP and why it is helpful. These sentences may be included in the Model or as part of your output template.
##### c. Information Expert (2 points) – display what information the IE holds with 1-2 sentences explaining why you used it.
##### d. Creator (2 points) – explain what the object creates with 1-2 sentences why it’s better than using main to create the object.
##### e. Polymorphism (2 points) – explain how your object is polymorphic. What other types might you include in such an arrangement?
##### f. Indirection (2 points) – how does the object intermediate between two other objects? What benefits does this provide?
##### g. Pure Fabrication (2 points) – what does this fabricated object do and why did you feel it should be a pure fabrication class (as opposed to some other class like information expert)?

#### 8. [5 points] Complete both the quizzes for unit one and the first two weeks of unit two.
