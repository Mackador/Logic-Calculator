# Logic-Calculator

## Requirements

### User Cases

*Mathmatical operations:*
| User                                        | System                                                      |
| :-------------:                             | :-------------:                                             |
| Specifies the first number                  | Displays the first number                                   |
| Indicates the operation                     | Clears the display                                          |
| Specifies the second number                 | Displays the second number                                  |
| Indicates that the calculation should begin | Displays the result of the operation of the two numbers     |

*Changing the base:*
| User                                                                        | System                          |
| :-------------:                                                             | :-------------:                 |
| Indicates that the numerical base should rotate to the next possible option | Displays current numerical base |

## Architecture

### State Machine

![State Machine](https://cdn.discordapp.com/attachments/357577039445884950/733373526043656303/unknown.png)

This state machine describes the functionality of the logic calculator. It shows all possible interactions at any given stage of the application. If there are any changes to be made in the application, this state machine must also be edited in order to reflect them.

### Future Modifications

For feature iterations of the logic calculator, the following may be implemented:
- More bases for the calculations
- Increasing the functionality of the calculator in regards to the manner in which is calculates the given numbers (i.e. not in the form FirstNumber -> Operation -> SecondNumber -> Equals)

These changes can all be done in the **MainActivity.kt** class and the **activity_main.xml** file as these are the files that take care of the functionality and the user interface, respectively.

## Tests

In order to verify the functionality of the logic calculator, here are some tests you may attempt to complete using it.

*Test 1:*
- Input the number **14**
- Click the **+** button
- Input the number **16**
- Click the **=** button
- The result textbox should display **30**

*Test 2:*
- Click the **2/10/16** button in order to change the base
- The numerical base textbox should display **HEX**
- Input the number **8AB**
- Click the **-** button
- Input the number **1BC**
- Click the **=** button
- The result textbox should display **6EF**


*Test 3:*
- Click the **2/10/16** button in order to change the base
- The numerical base textbox should display **HEX**
- Click the **2/10/16** button in order to change the base
- The numerical base textbox should display **BIN**
- Input the number **1010**
- Click the **x** button
- Input the number **1100**
- Click the **=** button
- The result textbox should display **1111000**

*Test 4:*
- Input the number **A**
- The result textbox should display **Unavailable** due to A being a hexadecimal value and not a decimal one

*Test 5:*
- Input any available number
- Click the **2/10/16**
- The numberical base textbox should display **HEX** and should terminate any ongoing operation in the **DEC** numberical base

## Demonstration
![Logic Calculator Demonstration Video](https://youtu.be/_FVRUa9NsnQ)
