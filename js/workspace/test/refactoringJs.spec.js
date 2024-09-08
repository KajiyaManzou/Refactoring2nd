//import { test, expect } from "@jest/globals";
import { statement } from "../src/statement.js";

test("Refactoring 2nd chap1", () => {
    let playJson = {
        "hamlet": { "name": "Hamlet", "type": "tragedy" },
        "as-like": { "name": "As You Like It", "type": "comedy" },
        "othello": { "name": "Othello", "type": "tragedy" }
    }

    let invoiceJson = [
        {
            "customer": "BigCo",
            "performances": [
                {
                    "playID": "hamlet",
                    "audience": 55
                },
                {
                    "playID": "as-like",
                    "audience": 35
                },
                {
                    "playID": "othello",
                    "audience": 40
                }
            ]
        }
    ]

    let result = "Statement for BigCo\n" +
        "  Hamlet: $650.00 (55 seats)\n" +
        "  As You Like It: $580.00 (35 seats)\n" +
        "  Othello: $500.00 (40 seats)\n" +
        "Amount owed is $1,730.00\n" +
        "You earned 47 credits"

    expect(statement(invoiceJson[0], playJson)).toMatch(result);
});