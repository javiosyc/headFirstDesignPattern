package command;

public class RemoteControl {
	Command[] onCommands;
	Command[] offComands;

	public RemoteControl() {
		onCommands = new Command[7];
		offComands = new Command[7];

		Command noCommand = new NoCommand();

		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offComands[i] = noCommand;
		}
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offComands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}

	public void offButtonWasPushed(int slot) {
		offComands[slot].execute();
	}

	@Override
	public String toString() {

		StringBuilder stringBuff = new StringBuilder();
		stringBuff.append("\n--------Remote Control------");

		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "  "
					+ offComands[i].getClass().getName() + "\n");
		}

		return stringBuff.toString();
	}
}
