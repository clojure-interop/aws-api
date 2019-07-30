(ns com.amazonaws.jmespath.Comparator
  "Parent class for different types of comparison operators."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath Comparator]))

(defn ->comparator
  "Constructor.

  Constructs a new Comparator with the given lhs amd rhs
   expressions.

  lhs-expr - Left expression - `com.amazonaws.jmespath.JmesPathExpression`
  rhs-expr - Right expression - `com.amazonaws.jmespath.JmesPathExpression`"
  (^Comparator [^com.amazonaws.jmespath.JmesPathExpression lhs-expr ^com.amazonaws.jmespath.JmesPathExpression rhs-expr]
    (new Comparator lhs-expr rhs-expr)))

(defn get-lhs-expr
  "returns: `com.amazonaws.jmespath.JmesPathExpression`"
  (^com.amazonaws.jmespath.JmesPathExpression [^Comparator this]
    (-> this (.getLhsExpr))))

(defn get-rhs-expr
  "returns: `com.amazonaws.jmespath.JmesPathExpression`"
  (^com.amazonaws.jmespath.JmesPathExpression [^Comparator this]
    (-> this (.getRhsExpr))))

(defn matches
  "Abstract method definition that is overriden by subclasses
   to compare the lhs and rhs expressions depending on the
   particular type of comparator

  lhs - Lhs expression - `com.fasterxml.jackson.databind.JsonNode`
  rhs - Rhs expression - `com.fasterxml.jackson.databind.JsonNode`

  returns: True if the comparison is evaluated to true;
   False otherwise - `boolean`"
  (^Boolean [^Comparator this ^com.fasterxml.jackson.databind.JsonNode lhs ^com.fasterxml.jackson.databind.JsonNode rhs]
    (-> this (.matches lhs rhs))))

