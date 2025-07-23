# Install Redis
- `brew install redis`
- `brew services start redis`

# Redis CLI
- `redis-cli`
- `KEYS *` return all keys
- `TYPE key_name_here` get key type
- `HGET key_name_here field` get key

# Run `RedisExampleApplication.java`

# Verify
```redis
redis-cli
127.0.0.1:6379> KEYS *
1) "Student"
2) "Student:1033b1cd-aa3c-49d5-a256-2a022fde450c"
127.0.0.1:6379> HGET Student:1033b1cd-aa3c-49d5-a256-2a022fde450c name
"John Doe"
127.0.0.1:6379> HGETALL Student:1033b1cd-aa3c-49d5-a256-2a022fde450c
 1) "_class"
 2) "com.example.redis_example.model.Student"
 3) "gender"
 4) "MALE"
 5) "grade"
 6) "50"
 7) "id"
 8) "1033b1cd-aa3c-49d5-a256-2a022fde450c"
 9) "name"
10) "John Doe"
```