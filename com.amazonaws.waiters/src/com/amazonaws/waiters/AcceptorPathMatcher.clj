(ns com.amazonaws.waiters.AcceptorPathMatcher
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.waiters AcceptorPathMatcher]))

(defn ->acceptor-path-matcher
  "Constructor."
  (^AcceptorPathMatcher []
    (new AcceptorPathMatcher )))

(defn *path-all
  "PathAll matcher that checks if each element of the final
   result matches the expected result

  expected-result - Expected result given by the waiter definition - `com.fasterxml.jackson.databind.JsonNode`
  final-result - Final result of the resource got by the execution of the JmesPath expression given by the waiter definition - `com.fasterxml.jackson.databind.JsonNode`

  returns: True if all elements of the final result matches
   the expected result, False otherwise - `boolean`"
  (^Boolean [^com.fasterxml.jackson.databind.JsonNode expected-result ^com.fasterxml.jackson.databind.JsonNode final-result]
    (AcceptorPathMatcher/pathAll expected-result final-result)))

(defn *path-any
  "PathAny matcher that checks if any element of the final
   result matches the expected result

  expected-result - Expected result given by the waiter definition - `com.fasterxml.jackson.databind.JsonNode`
  final-result - Final result of the resource got by the execution of the JmesPath expression given by the waiter definition - `com.fasterxml.jackson.databind.JsonNode`

  returns: True if any single element of the final result matches
   the expected result, False if none matched - `boolean`"
  (^Boolean [^com.fasterxml.jackson.databind.JsonNode expected-result ^com.fasterxml.jackson.databind.JsonNode final-result]
    (AcceptorPathMatcher/pathAny expected-result final-result)))

(defn *path
  "Path matcher that checks if the final result
   matches the expected result

  expected-result - Expected result given by the waiter definition - `com.fasterxml.jackson.databind.JsonNode`
  final-result - Final result of the resource got by the execution of the JmesPath expression given by the waiter definition - `com.fasterxml.jackson.databind.JsonNode`

  returns: True if the final result matches the expected result,
   False otherwise - `boolean`"
  (^Boolean [^com.fasterxml.jackson.databind.JsonNode expected-result ^com.fasterxml.jackson.databind.JsonNode final-result]
    (AcceptorPathMatcher/path expected-result final-result)))

