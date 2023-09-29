# Environmental Data Analysis in Python

# Sample environmental data
data = [
    {"location": "City A", "temperature": 25, "humidity": 60},
    {"location": "City B", "temperature": 28, "humidity": 55},
    {"location": "City C", "temperature": 22, "humidity": 70},
]

# Calculate average temperature and humidity
total_temp = 0
total_humidity = 0

for entry in data:
    total_temp += entry["temperature"]
    total_humidity += entry["humidity"]

avg_temp = total_temp / len(data)
avg_humidity = total_humidity / len(data)

# Write the results to a text file
with open("environmental_data.txt", "w") as file:
    file.write(f"Average Temperature: {avg_temp}\n")
    file.write(f"Average Humidity: {avg_humidity}\n")

print("Results written to environmental_data.txt")
