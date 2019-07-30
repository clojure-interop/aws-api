(ns com.amazonaws.metrics.NoOpClassForJavadocGeneration
  "A NOOP class that is used only for javadoc generation to succeed."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.metrics NoOpClassForJavadocGeneration]))

(defn ->no-op-class-for-javadoc-generation
  "Constructor."
  (^NoOpClassForJavadocGeneration []
    (new NoOpClassForJavadocGeneration )))

