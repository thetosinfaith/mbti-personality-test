import java.util.Objects;
import java.util.Scanner;
                public class PersonalityTest {
                    public static void main(String[] args) {
                        Scanner userInput = new Scanner(System.in);

                        System.out.println("What's your name?");
                        String name = userInput.nextLine();

                        int countA = 0;
                        int countB = 0;

                        for (int questionNumber = 1; questionNumber <= 20; questionNumber++) {
                            System.out.println("Question " + questionNumber + ":");
                            System.out.println("A. Tough-minded, Just");
                        System.out.println("B. Tender-hearted, Merciful");
                        String one = userInput.nextLine();

                        if (Objects.equals(one, "A")){
                            countA++;
                        }else if ((Objects.equals(one, "B"))){
                            countB++;
                        }else {
                            System.out.println("""
                                    Expected 'A' or 'B' as a response
                                    I know this is an error, please retry again
                                    """);
                        }questionNumber --;

                                System.out.println("A. Candid, Straightforward, Frank");
                        System.out.println("B. Tactful, Kind, Encouraging");
                        String two = userInput.nextLine();

                        try {
                            System.out.println("A. Focus on here-and-now");
                            System.out.println("B. Look to the future, global perspective, big picture");
                            String three = userInput.nextLine();

                            if (Objects.equals(three, "A") || Objects.equals(three, "B"))
                                throw new IllegalArgumentException("""
                                        Expected 'A' or 'B' as a response
                                        I know this is an error, please retry again
                                            """);

                            else
                                System.out.println(three);

                        } catch (IllegalArgumentException exception) {
                            System.out.println("Expected 'A' or 'B' as a response");
                            System.out.println("I know this is an error, please retry again " + exception.getMessage());
                            System.out.println("A. Focus on here-and-now");
                            System.out.println("B. Look to the future, global perspective, big picture");
                        }

                        System.out.println("A. Control, Govern");
                        System.out.println("B. Latitude, Freedom");
                        String four = userInput.nextLine();


                        System.out.println("""
                                1. "expand energy, enjoy groups", "conserve energy, enjoy one-on-one"
                                2. "interpret literally", "look for meaning and possibilities"
                                3. "logical, thinking, questioning", "empathetic, feeling, accommodating"
                                4. "organized, orderly", "flexible, adaptable"
                                5. "more outgoing, think out loud", "more reserved, think to yourself"
                                6. "practical, realistic, experiential", "imaginative, innovative, theoretical"
                                7. "candid, straight forward, frank", "tactful, kind, encouraging"
                                8. "plan, schedule", "unplanned, spontaneous"
                                9. "seek many tasks", public activities, interaction with others", "seek private, solitary activities with quiet to concentrate"
                                10. "standard, usual, conventional", "different, novel, unique"
                                11. "firm, tend to criticize, hold the line", "gentle, tend to appreciate, conciliate"
                                12. "regulated, structured", "easy-going, live and let live"
                                13. "external, communicative, express yourself", "internal, reticent, keep to yourself"
                                14. "focus on here-and-now", "look to the future, global perspective, big picture"
                                15. "tough minded, just", "tender-hearted, merciful"
                                16. "preparation, plan ahead", "go with the flow, adapt as you go"
                                17. "active, initiate", "reflective, deliberate"
                                18. "facts, things, what is", "ideas, dreams, what could be", philosophical"
                                19. "matter of fact, issue-oriented", "sensitive, people-oriented, compassionate"
                                20. "control, govern", "latitude, freedom"
                                """);

                        System.out.println("Extroverted E vs Introverted I: Questions: ");

                        System.out.print("Seeing S vs Intuitive N: Questions ");
                        String five = userInput.next();

                        System.out.print("Thinking T vs Feeling F: Questions ");
                        String six = userInput.next();

                        System.out.print("Judging J vs Perceptive P: Questions ");
                        String seven = userInput.next();

                        System.out.println("Hello " + name); System.out.println("You selected: ");
                        System.out.println(one);
                        System.out.println(two);
                        System.out.println(userInput);
                        System.out.println(four);
                        System.out.println(five);

                            System.out.println("Number of A responses: " + countA);
                            System.out.println("Number of B responses: " + countB);

                            if (countA > countB) {
                                System.out.println("Number of A selected: " + countA);
                            }
                            else if (countB > countA)
                                System.out.println("Number of A selected:" + countB);

                        }

                        if (Objects.equals(userInput, "A") || Objects.equals(userInput, "B"));
                        System.out.println("Numbers of A selected" + userInput);
                        System.out.println("Numbers of B selected" + userInput);

                        System.out.println("""
                                INFP
                                
                                       Healer
                                       The Thoughtful Idealist (MBTI)
                                       The Mediator (16Personalities)
                                       
                                The INFP Personality Type
                                
                                INFPs are imaginative idealists, guided by their core values and beliefs.
                                  To a Healer, possibilities are paramount; the realism of the moment is only 
                                  of passing concern. They see potential for a better future, and pursue truth 
                                  and meaning with their own individual flair.      
                                  
                                 INFPs are sensitive, caring and compassionate, and are deeply concerned with
                                  the personal groth of themselves and others. Individualistic and 
                                  non-judgemental, INFPs believe that each person must find their own path. They
                                  enjoy spending time exploring their own ideas and values, and are gently 
                                  encouraging to others to do the same. INFPs are creative and often artistic;
                                  they enjoy findding new outlets for self - expression.
                                  
                                 What does INFP stand for?
                                 INFP is one of the sixteen personality types created by Katharine Briggs and
                                   Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI). INFP
                                   stands for Introversion, iNtution, Feeling, and Perceiving, which are four
                                   core personality traits based on the work of psychologist C.G. Jung. 
                                   
                                 Each of the four letters of the INFP code signifies a key personality trait of
                                   this type. INFPs are energized by the time alone (Introverted), focus on idea
                                and concepts rather than facts and details (iNtuitive), make decisions based 
                                on feelings and values (Feeling), and prefer to be spontaneous and flexible
                                rather than planned and organized (Perceiving).
                                """);







                    }




                }