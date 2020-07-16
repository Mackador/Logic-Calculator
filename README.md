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
![State Machine](https://cdn.discordapp.com/attachments/357577039445884950/733372433117216828/unknown.png)

This state machine describes the functionality of the logic calculator. It shows all possible interactions at any given stage of the application. If there are any changes to be made in the application, this state machine must also be edited in order to reflect them.
