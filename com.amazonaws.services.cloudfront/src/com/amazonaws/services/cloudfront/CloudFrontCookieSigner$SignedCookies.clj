(ns com.amazonaws.services.cloudfront.CloudFrontCookieSigner$SignedCookies
  "Contains common cookies used by Amazon CloudFront."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudfront CloudFrontCookieSigner$SignedCookies]))

(defn ->signed-cookies
  "Constructor."
  (^CloudFrontCookieSigner$SignedCookies []
    (new CloudFrontCookieSigner$SignedCookies )))

(defn get-key-pair-id
  "returns: `java.util.Map$Entry<java.lang.String,java.lang.String>`"
  (^java.util.Map$Entry [^CloudFrontCookieSigner$SignedCookies this]
    (-> this (.getKeyPairId))))

(defn set-key-pair-id
  "key-pair-id - `java.lang.String`"
  ([^CloudFrontCookieSigner$SignedCookies this ^java.lang.String key-pair-id]
    (-> this (.setKeyPairId key-pair-id))))

(defn get-signature
  "returns: `java.util.Map$Entry<java.lang.String,java.lang.String>`"
  (^java.util.Map$Entry [^CloudFrontCookieSigner$SignedCookies this]
    (-> this (.getSignature))))

(defn set-signature
  "signature - `java.lang.String`"
  ([^CloudFrontCookieSigner$SignedCookies this ^java.lang.String signature]
    (-> this (.setSignature signature))))

