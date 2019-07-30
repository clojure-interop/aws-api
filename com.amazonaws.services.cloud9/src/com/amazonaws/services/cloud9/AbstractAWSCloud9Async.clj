(ns com.amazonaws.services.cloud9.AbstractAWSCloud9Async
  "Abstract implementation of AWSCloud9Async. Convenient method forms pass through to the corresponding overload
  that takes a request object and an AsyncHandler, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloud9 AbstractAWSCloud9Async]))

(defn describe-environment-memberships-async
  "Description copied from interface: AWSCloud9Async

  request - `com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEnvironmentMemberships operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCloud9Async this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEnvironmentMembershipsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloud9Async this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsRequest request]
    (-> this (.describeEnvironmentMembershipsAsync request))))

(defn update-environment-async
  "Description copied from interface: AWSCloud9Async

  request - `com.amazonaws.services.cloud9.model.UpdateEnvironmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEnvironment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.UpdateEnvironmentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCloud9Async this ^com.amazonaws.services.cloud9.model.UpdateEnvironmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEnvironmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloud9Async this ^com.amazonaws.services.cloud9.model.UpdateEnvironmentRequest request]
    (-> this (.updateEnvironmentAsync request))))

(defn create-environment-ec-2-async
  "Description copied from interface: AWSCloud9Async

  request - `com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Request`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEnvironmentEC2 operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Result>`"
  (^java.util.concurrent.Future [^AbstractAWSCloud9Async this ^com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Request request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEnvironmentEC2Async request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloud9Async this ^com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Request request]
    (-> this (.createEnvironmentEC2Async request))))

(defn delete-environment-async
  "Description copied from interface: AWSCloud9Async

  request - `com.amazonaws.services.cloud9.model.DeleteEnvironmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEnvironment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.DeleteEnvironmentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCloud9Async this ^com.amazonaws.services.cloud9.model.DeleteEnvironmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEnvironmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloud9Async this ^com.amazonaws.services.cloud9.model.DeleteEnvironmentRequest request]
    (-> this (.deleteEnvironmentAsync request))))

(defn list-environments-async
  "Description copied from interface: AWSCloud9Async

  request - `com.amazonaws.services.cloud9.model.ListEnvironmentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEnvironments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.ListEnvironmentsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCloud9Async this ^com.amazonaws.services.cloud9.model.ListEnvironmentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEnvironmentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloud9Async this ^com.amazonaws.services.cloud9.model.ListEnvironmentsRequest request]
    (-> this (.listEnvironmentsAsync request))))

(defn describe-environment-status-async
  "Description copied from interface: AWSCloud9Async

  request - `com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEnvironmentStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCloud9Async this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEnvironmentStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloud9Async this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusRequest request]
    (-> this (.describeEnvironmentStatusAsync request))))

(defn delete-environment-membership-async
  "Description copied from interface: AWSCloud9Async

  request - `com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEnvironmentMembership operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCloud9Async this ^com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEnvironmentMembershipAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloud9Async this ^com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipRequest request]
    (-> this (.deleteEnvironmentMembershipAsync request))))

(defn create-environment-membership-async
  "Description copied from interface: AWSCloud9Async

  request - `com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEnvironmentMembership operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCloud9Async this ^com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEnvironmentMembershipAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloud9Async this ^com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipRequest request]
    (-> this (.createEnvironmentMembershipAsync request))))

(defn describe-environments-async
  "Description copied from interface: AWSCloud9Async

  request - `com.amazonaws.services.cloud9.model.DescribeEnvironmentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEnvironments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.DescribeEnvironmentsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCloud9Async this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEnvironmentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloud9Async this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentsRequest request]
    (-> this (.describeEnvironmentsAsync request))))

(defn update-environment-membership-async
  "Description copied from interface: AWSCloud9Async

  request - `com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEnvironmentMembership operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCloud9Async this ^com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEnvironmentMembershipAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloud9Async this ^com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipRequest request]
    (-> this (.updateEnvironmentMembershipAsync request))))

