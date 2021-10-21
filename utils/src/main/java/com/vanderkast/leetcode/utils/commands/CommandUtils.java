package com.vanderkast.leetcode.utils.commands;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.util.List;
import java.util.Optional;

public class CommandUtils {
    private CommandUtils() {
    }

    public static <T> List<Object> inject(Class<T> tClass, String[] commands, Object[][] arguments) throws CommandException {
//            Constructor<T> constructor = tClass.getConstructor(parseParameters(arguments[0]));
        // todo implement command injector
        throw new UnsupportedOperationException();
    }

    public static class CommandException extends Exception {
        public CommandException(String message) {
            super(message);
        }
    }

    private static Class<?>[] parseParameters(Object[] arguments) {
        Class<?>[] parameters = new Class[arguments.length];
        for (int i = 0; i < arguments.length; i++) {
            parameters[i] = arguments[i].getClass();
        }
        return parameters;
    }

    private enum Command {
        CONSTRUCTOR(name -> name.length() > 0 && Character.isUpperCase(name.charAt(0)), null), // todo implement constructor invoker
        METHOD(name -> name.length() > 0 && Character.isLowerCase(name.charAt(0)), null);// todo implement method invoker

        public static final Command[] VALUES = Command.values();

        private final NamingGuardian naming;
        private final Invoker invoker;

        Command(NamingGuardian nameAcceptable, Invoker invoker) {
            this.naming = nameAcceptable;
            this.invoker = invoker;
        }

        interface NamingGuardian {
            boolean isAcceptable(String name);
        }

        interface Invoker {
            // todo declare command invoker
        }

        static Optional<Command> parse(String commandName) {
            for (var command : VALUES) {
                if (command.naming.isAcceptable(commandName))
                    return Optional.of(command);
            }
            return Optional.empty();
        }
    }
}
