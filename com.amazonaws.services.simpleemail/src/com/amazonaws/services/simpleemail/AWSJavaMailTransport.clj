(ns com.amazonaws.services.simpleemail.AWSJavaMailTransport
  "A transport implementation using Amazon Web Service's E-mail Service. For
  JavaMail purposes this transport implementation uses the \"aws\" protocol. In
  order to send messages through the E-mail Service your AWS Credentials
  (http://aws.amazon.com/security-credentials) need to be either in the
  JavaMail Session's Properties (mail.aws.user and mail.aws.password), passed
  into the connect() method, or set in the Session's setPasswordAuthentication
  method. Parameters passed into the connect method as well as
  PasswordAuthentication information supersedes the properties field for a
  particular session. When connecting your AWS Access Key is your username and
  your AWS Secret Key is your password.

  This transport implementation only accepts MIME encoded messages (see
  MimeMessage class) and RFC822 E-mail addresses (see InternetAddress class)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.simpleemail AWSJavaMailTransport]))

(defn ->aws-java-mail-transport
  "Constructor.

  session - `Session`
  urlname - `URLName`"
  (^AWSJavaMailTransport [session urlname]
    (new AWSJavaMailTransport session urlname)))

(def *-aws-email-service-endpoint-property
  "Static Constant.

  type: java.lang.String"
  AWSJavaMailTransport/AWS_EMAIL_SERVICE_ENDPOINT_PROPERTY)

(def *-aws-secret-key-property
  "Static Constant.

  type: java.lang.String"
  AWSJavaMailTransport/AWS_SECRET_KEY_PROPERTY)

(def *-aws-access-key-property
  "Static Constant.

  type: java.lang.String"
  AWSJavaMailTransport/AWS_ACCESS_KEY_PROPERTY)

(defn send-message
  "Sends a MIME message through Amazon's E-mail Service with the specified
   recipients. Addresses that are passed into this method are merged with
   the ones already embedded in the message (duplicates are removed).

  msg - A Mime type e-mail message to be sent - `Message`
  addresses - Additional e-mail addresses (RFC-822) to be included in the message - `Address[]`

  throws: MessagingException"
  ([^AWSJavaMailTransport this msg addresses]
    (-> this (.sendMessage msg addresses))))

(defn close
  "throws: MessagingException"
  ([^AWSJavaMailTransport this]
    (-> this (.close))))

(defn get-last-message-id
  "The unique message identifier ot the last message sent by sendMessage

  returns: The unique message identifier sent by the last
           sendMessage action. - `java.lang.String`"
  (^java.lang.String [^AWSJavaMailTransport this]
    (-> this (.getLastMessageId))))

(defn append-user-agent
  "request - `X`
  user-agent - `java.lang.String`

  returns: `<X extends com.amazonaws.AmazonWebServiceRequest> X`"
  ([^AWSJavaMailTransport this request ^java.lang.String user-agent]
    (-> this (.appendUserAgent request user-agent))))

