(ns com.amazonaws.internal.SdkPredicate
  "Similar to Predicate functional interface in Java 8"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal SdkPredicate]))

(defn ->sdk-predicate
  "Constructor."
  (^SdkPredicate []
    (new SdkPredicate )))

(defn test
  "Evaluates this predicate on the given argument

  t - The input argument - `T`

  returns: true if the input argument matches the predicate, otherwise false - `boolean`"
  (^Boolean [^SdkPredicate this t]
    (-> this (.test t))))

