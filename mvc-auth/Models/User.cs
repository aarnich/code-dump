using System;

namespace mvc_auth.Models
{
    public class User
    {   [key]
        public string UserID { get; set; }
        public string Name { get; set; }
        public string Email { get; set; }
        public string Password { get; set; }
        public int Age { get; set; }
        public decimal MHScore { get; set; }

    }
}
