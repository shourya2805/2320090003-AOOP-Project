#Business Directory System

Overview
The Business Directory System is a Java application designed to manage and search business information efficiently. This system allows users to add businesses to a directory and retrieve them based on specific categories. It is built to demonstrate fundamental object-oriented programming principles and provides a basic implementation of a business directory with search capabilities.

Features
Business Management: Add and store details about various businesses including their name, address, contact information, category, and services.
Category-based Search: Retrieve a list of businesses based on their category, making it easy to find businesses in specific sectors like cafes, bookstores, etc.
Unit Testing: Includes comprehensive unit tests using JUnit to ensure the functionality of adding and searching businesses.

Project Structure
Business.java: Represents a business entity with properties such as name, address, contact, category, and services. Includes getter methods for accessing these properties.
BusinessDirectory.java: Manages a collection of Business objects. Provides methods to add businesses to the directory and search for businesses by category.
BusinessDirectoryTest.java: Contains unit tests for BusinessDirectory, validating the correct functionality of adding and searching businesses.
