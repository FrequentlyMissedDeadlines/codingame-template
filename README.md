# codingame-template

Put your code in `src` and run the following command to automatically rebuild your code on save.

```bash
./build.bash src/path/to/your/code/YourMainClass.java
```

Your merged file `YourMainClass.java` will be at the root of your project.


## Useful prompts
### Parse input and fill GameState
```
Update GameState to store all game round information as described in the rules. Create several classes if needed to have a clean and reusable set of classes. Update Player.java to use this new class and fill it with the inputs. Be careful, some fields are static, some others are updated each turn so you must instantiate a new GameState each turn.
```


## Credits

* [competitive-programming](https://github.com/Manwe56/competitive-programming) for the file merger script.