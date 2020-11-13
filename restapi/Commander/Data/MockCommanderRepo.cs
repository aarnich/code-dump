using System.Collections.Generic;
using Commander.Models;
namespace Commander.Data
{

    public class MockCommanderRepo : ICommanderRepo
    {
        public IEnumerable<Command> GetAllCommands()
        {
            var commands = new List<Command>
            {
                new Command { Id = 1, HowTo = "test1", Line = "testline1", Platform = "testplatform1" },
                new Command { Id = 2, HowTo = "test2", Line = "testline2", Platform = "testplatform2" },
                new Command { Id = 3, HowTo = "test3", Line = "testline3", Platform = "testplatform3" }
            };
            return commands;
        }

        public Command GetCommandById(int id)
        {
            return new Command { Id = 0, HowTo = "test", Line = "testline", Platform = "testplatform" };
        }
    }
}