(ns com.amazonaws.services.glacier.TreeHashGenerator
  "Utility class for calculating tree hashes.

  For more information on tree hashing, see
  http://en.wikipedia.org/wiki/Hash_tree."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.glacier TreeHashGenerator]))

(defn ->tree-hash-generator
  "Constructor."
  (^TreeHashGenerator []
    (new TreeHashGenerator )))

(defn *calculate-tree-hash
  "Calculates a hex encoded binary hash using a tree hashing algorithm for
   the data in the specified file.

  file - The file containing the data to hash. - `java.io.File`

  returns: The hex encoded binary tree hash for the data in the specified
           file. - `java.lang.String`

  throws: com.amazonaws.AmazonClientException - If any problems were encountered reading the data or computing the hash."
  (^java.lang.String [^java.io.File file]
    (TreeHashGenerator/calculateTreeHash file)))

