//import { test, expect } from "@jest/globals";
import { statement } from "../src/statement";

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

    let resultHtml = "<H1>Statement for BigCo</H1>\n" +
        "<table>\n" +
        "<tr><th>play</th><th>seats</th><th>cost</th></tr>\n" +
        "  <tr><td>Hamlet</td><td>55</td><td>$650.00</td></tr>\n" +
        "  <tr><td>As You Like It</td><td>35</td><td>$580.00</td></tr>\n" +
        "  <tr><td>Othello</td><td>40</td><td>$500.00</td></tr>\n" +
        "</table>\n" +
        "<p>Amount owed is <em>$1,730.00</em></p>\n" +
        "<p>You earned <em>47</em> credits</p>"

    expect(statement(invoiceJson[0], playJson)).toMatch(result);

    //expect(htmlStatement(invoiceJson[0], playJson)).toMatch(resultHtml);
});