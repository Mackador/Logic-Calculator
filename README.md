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
![State Machine](https://cdn.discordapp.com/attachments/357577039445884950/733373526043656303/unknown.png)

This state machine describes the functionality of the logic calculator. It shows all possible interactions at any given stage of the application. If there are any changes to be made in the application, this state machine must also be edited in order to reflect them.

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
- The numerical base text box should display **HEX**
- Input the number **8AB**
- Click the **-** button
- Input the number **1BC**
- Click the **=** button
- The result textbox should display **6EF**


*Test 3:*
- Click the **2/10/16** button in order to change the base
- The numerical base text box should display **HEX**
- Click the **2/10/16** button in order to change the base
- The numerical base text box should display **BIN**
- Input the number **1010**
- Click the **x** button
- Input the number **1100**
- Click the **=** button
- The result textbox should display **01111000**
