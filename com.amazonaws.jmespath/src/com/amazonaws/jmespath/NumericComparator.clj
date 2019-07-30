(ns com.amazonaws.jmespath.NumericComparator
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath NumericComparator]))

(defn ->numeric-comparator
  "Constructor.

  Constructs a new Comparator with the given lhs amd rhs
   expressions.

  lhs-expr - Left expression - `com.amazonaws.jmespath.JmesPathExpression`
  rhs-expr - Right expression - `com.amazonaws.jmespath.JmesPathExpression`"
  (^NumericComparator [^com.amazonaws.jmespath.JmesPathExpression lhs-expr ^com.amazonaws.jmespath.JmesPathExpression rhs-expr]
    (new NumericComparator lhs-expr rhs-expr)))

(defn matches
  "Converts the lhs and rhs JsonNodes to the numeric values
   and delegates to the matches method that operates on the
   numeric values alone.

  lhs - Lhs expression - `com.fasterxml.jackson.databind.JsonNode`
  rhs - Rhs expression - `com.fasterxml.jackson.databind.JsonNode`

  returns: Boolean result of the matches method of the
   corresponding comparison operator - `boolean`"
  (^Boolean [^NumericComparator this ^com.fasterxml.jackson.databind.JsonNode lhs ^com.fasterxml.jackson.databind.JsonNode rhs]
    (-> this (.matches lhs rhs))))

