# Task Master

You know you have something that needs to get done... only problem is, you don't remember what it is.  This isn't Harry Potter, there's no magic spell.  Luck for you, Task Master is here to help.  Rendering memory obsolete since 2019, Task Master will track all your tasks to completion, allow users to assign them, and let you know when they have been completed.


## Features


## Database Structure

* Project

|  Field      |  Type      |
|-------------|------------|
| id          | Long       |
| title       | String     |
| description | String     |
| tasks       | List<Task> |
| user        | User       |


* Task

|  Field      |  Type      |
|-------------|------------|
| id          | Long       |
| title       | String     |
| description | String     |
| tasks       | List<Task> |
| user        | User       |
   

## Resources and Credits

* [Create enums in Room database](https://stackoverflow.com/questions/44498616/android-architecture-components-using-enums)