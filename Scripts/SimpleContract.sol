// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract SimpleContract {
    string private myString;

    function setString(string memory newString) public {
        myString = newString;
    }

    function getString() public view returns (string memory) {
        return myString;
    }
}

