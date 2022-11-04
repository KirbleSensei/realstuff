import time
from selenium import webdriver

driver = webdriver.Chrome() ##--// Opens up browser
driver.get("https://longdogechallenge.com/") ##--// Heads to link

PAUSE_TIME = 0 ##--// Set it to whatever value you want

last_bar_height = driver.execute_script("return document.body.scrollHeight") ##--// returns bar height

while True: ##--// Loop de loop
    driver.execute_script("window.scrollTo(0, document.body.scrollHeight);") ##--// scrolls
    time.sleep(PAUSE_TIME) 
    new_height = driver.execute_script("return document.body.scrollHeight") 
    if new_height == last_bar_height:
        break
    last_bar_height = new_height
