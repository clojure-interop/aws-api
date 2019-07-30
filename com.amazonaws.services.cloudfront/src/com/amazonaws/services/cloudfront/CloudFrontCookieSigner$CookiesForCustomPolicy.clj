(ns com.amazonaws.services.cloudfront.CloudFrontCookieSigner$CookiesForCustomPolicy
  "Contains the cookies used to access restricted content from
  CloudFront using a custom policy."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudfront CloudFrontCookieSigner$CookiesForCustomPolicy]))

(defn ->cookies-for-custom-policy
  "Constructor."
  (^CloudFrontCookieSigner$CookiesForCustomPolicy []
    (new CloudFrontCookieSigner$CookiesForCustomPolicy )))

(defn policy
  "Instance Field.

  type: java.util.Map$Entry<java.lang.String,java.lang.String>"
  (^java.util.Map$Entry [^CloudFrontCookieSigner$CookiesForCustomPolicy this]
    (-> this .-policy)))

(defn get-policy
  "returns: `java.util.Map$Entry<java.lang.String,java.lang.String>`"
  (^java.util.Map$Entry [^CloudFrontCookieSigner$CookiesForCustomPolicy this]
    (-> this (.getPolicy))))

(defn set-policy
  "policy - `java.lang.String`"
  ([^CloudFrontCookieSigner$CookiesForCustomPolicy this ^java.lang.String policy]
    (-> this (.setPolicy policy))))

