(ns com.amazonaws.services.ec2.AmazonEC2Async
  "Interface for accessing Amazon EC2 asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonEC2Async instead.


  Amazon Elastic Compute Cloud

  Amazon Elastic Compute Cloud (Amazon EC2) provides secure and resizable computing capacity in the AWS cloud. Using
  Amazon EC2 eliminates the need to invest in hardware up front, so you can develop and deploy applications faster.


  To learn more, see the following resources:




  Amazon EC2: Amazon EC2 product page, Amazon EC2 documentation




  Amazon EBS: Amazon EBS product page, Amazon EBS documentation




  Amazon VPC: Amazon VPC product page, Amazon VPC documentation




  AWS VPN: AWS VPN product page, AWS VPN documentation"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ec2 AmazonEC2Async]))

(defn associate-subnet-cidr-block-async
  "Associates a CIDR block with your subnet. You can only associate a single IPv6 CIDR block with your subnet. An
   IPv6 CIDR block must have a prefix length of /64.

  associate-subnet-cidr-block-request - `com.amazonaws.services.ec2.model.AssociateSubnetCidrBlockRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateSubnetCidrBlock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AssociateSubnetCidrBlockResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AssociateSubnetCidrBlockRequest associate-subnet-cidr-block-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateSubnetCidrBlockAsync associate-subnet-cidr-block-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AssociateSubnetCidrBlockRequest associate-subnet-cidr-block-request]
    (-> this (.associateSubnetCidrBlockAsync associate-subnet-cidr-block-request))))

(defn delete-transit-gateway-route-async
  "Deletes the specified route from the specified transit gateway route table.

  delete-transit-gateway-route-request - `com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTransitGatewayRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteRequest delete-transit-gateway-route-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTransitGatewayRouteAsync delete-transit-gateway-route-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteRequest delete-transit-gateway-route-request]
    (-> this (.deleteTransitGatewayRouteAsync delete-transit-gateway-route-request))))

(defn disassociate-iam-instance-profile-async
  "Disassociates an IAM instance profile from a running or stopped instance.


   Use DescribeIamInstanceProfileAssociations to get the association ID.

  disassociate-iam-instance-profile-request - `com.amazonaws.services.ec2.model.DisassociateIamInstanceProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateIamInstanceProfile operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisassociateIamInstanceProfileResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisassociateIamInstanceProfileRequest disassociate-iam-instance-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateIamInstanceProfileAsync disassociate-iam-instance-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisassociateIamInstanceProfileRequest disassociate-iam-instance-profile-request]
    (-> this (.disassociateIamInstanceProfileAsync disassociate-iam-instance-profile-request))))

(defn describe-instance-status-async
  "Describes the status of the specified instances or all of your instances. By default, only running instances are
   described, unless you specifically indicate to return the status of all instances.


   Instance status includes the following components:




   Status checks - Amazon EC2 performs status checks on running EC2 instances to identify hardware and
   software issues. For more information, see Status
   Checks for Your Instances and Troubleshooting
   Instances with Failed Status Checks in the Amazon Elastic Compute Cloud User Guide.




   Scheduled events - Amazon EC2 can schedule events (such as reboot, stop, or terminate) for your instances
   related to hardware issues, software updates, or system maintenance. For more information, see Scheduled
   Events for Your Instances in the Amazon Elastic Compute Cloud User Guide.




   Instance state - You can manage your instances from the moment you launch them through their termination.
   For more information, see Instance Lifecycle in
   the Amazon Elastic Compute Cloud User Guide.

  describe-instance-status-request - `com.amazonaws.services.ec2.model.DescribeInstanceStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstanceStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeInstanceStatusResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeInstanceStatusRequest describe-instance-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstanceStatusAsync describe-instance-status-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeInstanceStatusRequest describe-instance-status-request]
    (-> this (.describeInstanceStatusAsync describe-instance-status-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeInstanceStatusAsync))))

(defn detach-classic-link-vpc-async
  "Unlinks (detaches) a linked EC2-Classic instance from a VPC. After the instance has been unlinked, the VPC
   security groups are no longer associated with it. An instance is automatically unlinked from a VPC when it's
   stopped.

  detach-classic-link-vpc-request - `com.amazonaws.services.ec2.model.DetachClassicLinkVpcRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachClassicLinkVpc operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DetachClassicLinkVpcResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DetachClassicLinkVpcRequest detach-classic-link-vpc-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachClassicLinkVpcAsync detach-classic-link-vpc-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DetachClassicLinkVpcRequest detach-classic-link-vpc-request]
    (-> this (.detachClassicLinkVpcAsync detach-classic-link-vpc-request))))

(defn create-traffic-mirror-filter-async
  "Creates a Traffic Mirror filter.


   A Traffic Mirror filter is a set of rules that defines the traffic to mirror.


   By default, no traffic is mirrored. To mirror traffic, use CreateTrafficMirrorFilterRule to add Traffic
   Mirror rules to the filter. The rules you add define what traffic gets mirrored. You can also use
   ModifyTrafficMirrorFilterNetworkServices to mirror supported network services.

  create-traffic-mirror-filter-request - `com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTrafficMirrorFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRequest create-traffic-mirror-filter-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTrafficMirrorFilterAsync create-traffic-mirror-filter-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRequest create-traffic-mirror-filter-request]
    (-> this (.createTrafficMirrorFilterAsync create-traffic-mirror-filter-request))))

(defn describe-vpc-peering-connections-async
  "Describes one or more of your VPC peering connections.

  describe-vpc-peering-connections-request - `com.amazonaws.services.ec2.model.DescribeVpcPeeringConnectionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcPeeringConnections operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpcPeeringConnectionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpcPeeringConnectionsRequest describe-vpc-peering-connections-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcPeeringConnectionsAsync describe-vpc-peering-connections-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpcPeeringConnectionsRequest describe-vpc-peering-connections-request]
    (-> this (.describeVpcPeeringConnectionsAsync describe-vpc-peering-connections-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeVpcPeeringConnectionsAsync))))

(defn search-transit-gateway-routes-async
  "Searches for routes in the specified transit gateway route table.

  search-transit-gateway-routes-request - `com.amazonaws.services.ec2.model.SearchTransitGatewayRoutesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchTransitGatewayRoutes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.SearchTransitGatewayRoutesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.SearchTransitGatewayRoutesRequest search-transit-gateway-routes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchTransitGatewayRoutesAsync search-transit-gateway-routes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.SearchTransitGatewayRoutesRequest search-transit-gateway-routes-request]
    (-> this (.searchTransitGatewayRoutesAsync search-transit-gateway-routes-request))))

(defn revoke-security-group-ingress-async
  "Removes the specified ingress rules from a security group. To remove a rule, the values that you specify (for
   example, ports) must match the existing rule's values exactly.



   [EC2-Classic only] If the values you specify do not match the existing rule's values, no error is returned. Use
   DescribeSecurityGroups to verify that the rule has been removed.



   Each rule consists of the protocol and the CIDR range or source security group. For the TCP and UDP protocols,
   you must also specify the destination port or range of ports. For the ICMP protocol, you must also specify the
   ICMP type and code. If the security group rule has a description, you do not have to specify the description to
   revoke the rule.


   Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay
   might occur.

  revoke-security-group-ingress-request - `com.amazonaws.services.ec2.model.RevokeSecurityGroupIngressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeSecurityGroupIngress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RevokeSecurityGroupIngressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RevokeSecurityGroupIngressRequest revoke-security-group-ingress-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeSecurityGroupIngressAsync revoke-security-group-ingress-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RevokeSecurityGroupIngressRequest revoke-security-group-ingress-request]
    (-> this (.revokeSecurityGroupIngressAsync revoke-security-group-ingress-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.revokeSecurityGroupIngressAsync))))

(defn delete-route-table-async
  "Deletes the specified route table. You must disassociate the route table from any subnets before you can delete
   it. You can't delete the main route table.

  delete-route-table-request - `com.amazonaws.services.ec2.model.DeleteRouteTableRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRouteTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteRouteTableResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteRouteTableRequest delete-route-table-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRouteTableAsync delete-route-table-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteRouteTableRequest delete-route-table-request]
    (-> this (.deleteRouteTableAsync delete-route-table-request))))

(defn describe-bundle-tasks-async
  "Describes the specified bundle tasks or all of your bundle tasks.



   Completed bundle tasks are listed for only a limited time. If your bundle task is no longer in the list, you can
   still register an AMI from it. Just use RegisterImage with the Amazon S3 bucket name and image
   manifest name you provided to the bundle task.

  describe-bundle-tasks-request - `com.amazonaws.services.ec2.model.DescribeBundleTasksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBundleTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeBundleTasksResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeBundleTasksRequest describe-bundle-tasks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBundleTasksAsync describe-bundle-tasks-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeBundleTasksRequest describe-bundle-tasks-request]
    (-> this (.describeBundleTasksAsync describe-bundle-tasks-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeBundleTasksAsync))))

(defn replace-transit-gateway-route-async
  "Replaces the specified route in the specified transit gateway route table.

  replace-transit-gateway-route-request - `com.amazonaws.services.ec2.model.ReplaceTransitGatewayRouteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReplaceTransitGatewayRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ReplaceTransitGatewayRouteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ReplaceTransitGatewayRouteRequest replace-transit-gateway-route-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.replaceTransitGatewayRouteAsync replace-transit-gateway-route-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ReplaceTransitGatewayRouteRequest replace-transit-gateway-route-request]
    (-> this (.replaceTransitGatewayRouteAsync replace-transit-gateway-route-request))))

(defn describe-key-pairs-async
  "Describes the specified key pairs or all of your key pairs.


   For more information about key pairs, see Key Pairs in the Amazon
   Elastic Compute Cloud User Guide.

  describe-key-pairs-request - `com.amazonaws.services.ec2.model.DescribeKeyPairsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeKeyPairs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeKeyPairsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeKeyPairsRequest describe-key-pairs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeKeyPairsAsync describe-key-pairs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeKeyPairsRequest describe-key-pairs-request]
    (-> this (.describeKeyPairsAsync describe-key-pairs-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeKeyPairsAsync))))

(defn describe-id-format-async
  "Describes the ID format settings for your resources on a per-Region basis, for example, to view which resource
   types are enabled for longer IDs. This request only returns information about resource types whose ID formats can
   be modified; it does not return information about other resource types.


   The following resource types support longer IDs: bundle | conversion-task |
   customer-gateway | dhcp-options | elastic-ip-allocation |
   elastic-ip-association | export-task | flow-log | image |
   import-task | instance | internet-gateway | network-acl |
   network-acl-association | network-interface | network-interface-attachment
   | prefix-list | reservation | route-table |
   route-table-association | security-group | snapshot | subnet
   | subnet-cidr-block-association | volume | vpc |
   vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection |
   vpn-connection | vpn-gateway.


   These settings apply to the IAM user who makes the request; they do not apply to the entire AWS account. By
   default, an IAM user defaults to the same settings as the root user, unless they explicitly override the settings
   by running the ModifyIdFormat command. Resources created with longer IDs are visible to all IAM users,
   regardless of these settings and provided that they have permission to use the relevant Describe
   command for the resource type.

  describe-id-format-request - `com.amazonaws.services.ec2.model.DescribeIdFormatRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIdFormat operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeIdFormatResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeIdFormatRequest describe-id-format-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIdFormatAsync describe-id-format-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeIdFormatRequest describe-id-format-request]
    (-> this (.describeIdFormatAsync describe-id-format-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeIdFormatAsync))))

(defn modify-vpc-endpoint-service-permissions-async
  "Modifies the permissions for your VPC endpoint service. You can
   add or remove permissions for service consumers (IAM users, IAM roles, and AWS accounts) to connect to your
   endpoint service.


   If you grant permissions to all principals, the service is public. Any users who know the name of a public
   service can send a request to attach an endpoint. If the service does not require manual approval, attachments
   are automatically approved.

  modify-vpc-endpoint-service-permissions-request - `com.amazonaws.services.ec2.model.ModifyVpcEndpointServicePermissionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyVpcEndpointServicePermissions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyVpcEndpointServicePermissionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointServicePermissionsRequest modify-vpc-endpoint-service-permissions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyVpcEndpointServicePermissionsAsync modify-vpc-endpoint-service-permissions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointServicePermissionsRequest modify-vpc-endpoint-service-permissions-request]
    (-> this (.modifyVpcEndpointServicePermissionsAsync modify-vpc-endpoint-service-permissions-request))))

(defn modify-vpc-tenancy-async
  "Modifies the instance tenancy attribute of the specified VPC. You can change the instance tenancy attribute of a
   VPC to default only. You cannot change the instance tenancy attribute to dedicated.


   After you modify the tenancy of the VPC, any new instances that you launch into the VPC have a tenancy of
   default, unless you specify otherwise during launch. The tenancy of any existing instances in the
   VPC is not affected.


   For more information, see Dedicated Instances in the
   Amazon Elastic Compute Cloud User Guide.

  modify-vpc-tenancy-request - `com.amazonaws.services.ec2.model.ModifyVpcTenancyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyVpcTenancy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyVpcTenancyResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyVpcTenancyRequest modify-vpc-tenancy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyVpcTenancyAsync modify-vpc-tenancy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyVpcTenancyRequest modify-vpc-tenancy-request]
    (-> this (.modifyVpcTenancyAsync modify-vpc-tenancy-request))))

(defn stop-instances-async
  "Stops an Amazon EBS-backed instance.


   You can use the Stop action to hibernate an instance if the instance is enabled for
   hibernation and it meets the hibernation
   prerequisites. For more information, see Hibernate Your Instance in the
   Amazon Elastic Compute Cloud User Guide.


   We don't charge usage for a stopped instance, or data transfer fees; however, your root partition Amazon EBS
   volume remains and continues to persist your data, and you are charged for Amazon EBS volume usage. Every time
   you start your Windows instance, Amazon EC2 charges you for a full instance hour. If you stop and restart your
   Windows instance, a new instance hour begins and Amazon EC2 charges you for another full instance hour even if
   you are still within the same 60-minute period when it was stopped. Every time you start your Linux instance,
   Amazon EC2 charges a one-minute minimum for instance usage, and thereafter charges per second for instance usage.


   You can't start, stop, or hibernate Spot Instances, and you can't stop or hibernate instance store-backed
   instances. For information about using hibernation for Spot Instances, see Hibernating Interrupted Spot Instances in the Amazon Elastic Compute Cloud User Guide.


   When you stop or hibernate an instance, we shut it down. You can restart your instance at any time. Before
   stopping or hibernating an instance, make sure it is in a state from which it can be restarted. Stopping an
   instance does not preserve data stored in RAM, but hibernating an instance does preserve data stored in RAM. If
   an instance cannot hibernate successfully, a normal shutdown occurs.


   Stopping and hibernating an instance is different to rebooting or terminating it. For example, when you stop or
   hibernate an instance, the root device and any other devices attached to the instance persist. When you terminate
   an instance, the root device and any other devices attached during the instance launch are automatically deleted.
   For more information about the differences between rebooting, stopping, hibernating, and terminating instances,
   see Instance
   Lifecycle in the Amazon Elastic Compute Cloud User Guide.


   When you stop an instance, we attempt to shut it down forcibly after a short while. If your instance appears
   stuck in the stopping state after a period of time, there may be an issue with the underlying host computer. For
   more information, see Troubleshooting
   Stopping Your Instance in the Amazon Elastic Compute Cloud User Guide.

  stop-instances-request - `com.amazonaws.services.ec2.model.StopInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.StopInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.StopInstancesRequest stop-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopInstancesAsync stop-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.StopInstancesRequest stop-instances-request]
    (-> this (.stopInstancesAsync stop-instances-request))))

(defn delete-vpn-gateway-async
  "Deletes the specified virtual private gateway. We recommend that before you delete a virtual private gateway, you
   detach it from the VPC and delete the VPN connection. Note that you don't need to delete the virtual private
   gateway if you plan to delete and recreate the VPN connection between your VPC and your network.

  delete-vpn-gateway-request - Contains the parameters for DeleteVpnGateway. - `com.amazonaws.services.ec2.model.DeleteVpnGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVpnGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteVpnGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteVpnGatewayRequest delete-vpn-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVpnGatewayAsync delete-vpn-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteVpnGatewayRequest delete-vpn-gateway-request]
    (-> this (.deleteVpnGatewayAsync delete-vpn-gateway-request))))

(defn create-image-async
  "Creates an Amazon EBS-backed AMI from an Amazon EBS-backed instance that is either running or stopped.


   If you customized your instance with instance store volumes or EBS volumes in addition to the root device volume,
   the new AMI contains block device mapping information for those volumes. When you launch an instance from this
   new AMI, the instance automatically launches with those additional volumes.


   For more information, see Creating Amazon EBS-Backed
   Linux AMIs in the Amazon Elastic Compute Cloud User Guide.

  create-image-request - `com.amazonaws.services.ec2.model.CreateImageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateImageResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateImageRequest create-image-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createImageAsync create-image-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateImageRequest create-image-request]
    (-> this (.createImageAsync create-image-request))))

(defn modify-fpga-image-attribute-async
  "Modifies the specified attribute of the specified Amazon FPGA Image (AFI).

  modify-fpga-image-attribute-request - `com.amazonaws.services.ec2.model.ModifyFpgaImageAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyFpgaImageAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyFpgaImageAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyFpgaImageAttributeRequest modify-fpga-image-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyFpgaImageAttributeAsync modify-fpga-image-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyFpgaImageAttributeRequest modify-fpga-image-attribute-request]
    (-> this (.modifyFpgaImageAttributeAsync modify-fpga-image-attribute-request))))

(defn describe-client-vpn-target-networks-async
  "Describes the target networks associated with the specified Client VPN endpoint.

  describe-client-vpn-target-networks-request - `com.amazonaws.services.ec2.model.DescribeClientVpnTargetNetworksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClientVpnTargetNetworks operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeClientVpnTargetNetworksResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeClientVpnTargetNetworksRequest describe-client-vpn-target-networks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClientVpnTargetNetworksAsync describe-client-vpn-target-networks-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeClientVpnTargetNetworksRequest describe-client-vpn-target-networks-request]
    (-> this (.describeClientVpnTargetNetworksAsync describe-client-vpn-target-networks-request))))

(defn modify-hosts-async
  "Modify the auto-placement setting of a Dedicated Host. When auto-placement is enabled, any instances that you
   launch with a tenancy of host but without a specific host ID are placed onto any available Dedicated
   Host in your account that has auto-placement enabled. When auto-placement is disabled, you need to provide a host
   ID to have the instance launch onto a specific host. If no host ID is provided, the instance is launched onto a
   suitable host with auto-placement enabled.

  modify-hosts-request - `com.amazonaws.services.ec2.model.ModifyHostsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyHosts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyHostsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyHostsRequest modify-hosts-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyHostsAsync modify-hosts-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyHostsRequest modify-hosts-request]
    (-> this (.modifyHostsAsync modify-hosts-request))))

(defn replace-route-table-association-async
  "Changes the route table associated with a given subnet in a VPC. After the operation completes, the subnet uses
   the routes in the new route table it's associated with. For more information about route tables, see Route Tables in the Amazon
   Virtual Private Cloud User Guide.


   You can also use ReplaceRouteTableAssociation to change which table is the main route table in the VPC. You just
   specify the main route table's association ID and the route table to be the new main route table.

  replace-route-table-association-request - `com.amazonaws.services.ec2.model.ReplaceRouteTableAssociationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReplaceRouteTableAssociation operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ReplaceRouteTableAssociationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ReplaceRouteTableAssociationRequest replace-route-table-association-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.replaceRouteTableAssociationAsync replace-route-table-association-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ReplaceRouteTableAssociationRequest replace-route-table-association-request]
    (-> this (.replaceRouteTableAssociationAsync replace-route-table-association-request))))

(defn describe-traffic-mirror-targets-async
  "Information about one or more Traffic Mirror targets.

  describe-traffic-mirror-targets-request - `com.amazonaws.services.ec2.model.DescribeTrafficMirrorTargetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTrafficMirrorTargets operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeTrafficMirrorTargetsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeTrafficMirrorTargetsRequest describe-traffic-mirror-targets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTrafficMirrorTargetsAsync describe-traffic-mirror-targets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeTrafficMirrorTargetsRequest describe-traffic-mirror-targets-request]
    (-> this (.describeTrafficMirrorTargetsAsync describe-traffic-mirror-targets-request))))

(defn allocate-hosts-async
  "Allocates a Dedicated Host to your account. At a minimum, specify the instance size type, Availability Zone, and
   quantity of hosts to allocate.

  allocate-hosts-request - `com.amazonaws.services.ec2.model.AllocateHostsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AllocateHosts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AllocateHostsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AllocateHostsRequest allocate-hosts-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.allocateHostsAsync allocate-hosts-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AllocateHostsRequest allocate-hosts-request]
    (-> this (.allocateHostsAsync allocate-hosts-request))))

(defn create-instance-export-task-async
  "Exports a running or stopped instance to an S3 bucket.


   For information about the supported operating systems, image formats, and known limitations for the types of
   instances you can export, see Exporting an Instance as a VM Using
   VM Import/Export in the VM Import/Export User Guide.

  create-instance-export-task-request - `com.amazonaws.services.ec2.model.CreateInstanceExportTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInstanceExportTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateInstanceExportTaskResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateInstanceExportTaskRequest create-instance-export-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInstanceExportTaskAsync create-instance-export-task-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateInstanceExportTaskRequest create-instance-export-task-request]
    (-> this (.createInstanceExportTaskAsync create-instance-export-task-request))))

(defn get-ebs-encryption-by-default-async
  "Describes whether EBS encryption by default is enabled for your account in the current Region.


   For more information, see Amazon
   EBS Encryption in the Amazon Elastic Compute Cloud User Guide.

  get-ebs-encryption-by-default-request - `com.amazonaws.services.ec2.model.GetEbsEncryptionByDefaultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEbsEncryptionByDefault operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetEbsEncryptionByDefaultResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetEbsEncryptionByDefaultRequest get-ebs-encryption-by-default-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEbsEncryptionByDefaultAsync get-ebs-encryption-by-default-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetEbsEncryptionByDefaultRequest get-ebs-encryption-by-default-request]
    (-> this (.getEbsEncryptionByDefaultAsync get-ebs-encryption-by-default-request))))

(defn describe-vpc-endpoint-services-async
  "Describes available services to which you can create a VPC endpoint.

  describe-vpc-endpoint-services-request - Contains the parameters for DescribeVpcEndpointServices. - `com.amazonaws.services.ec2.model.DescribeVpcEndpointServicesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcEndpointServices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpcEndpointServicesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointServicesRequest describe-vpc-endpoint-services-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcEndpointServicesAsync describe-vpc-endpoint-services-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointServicesRequest describe-vpc-endpoint-services-request]
    (-> this (.describeVpcEndpointServicesAsync describe-vpc-endpoint-services-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeVpcEndpointServicesAsync))))

(defn monitor-instances-async
  "Enables detailed monitoring for a running instance. Otherwise, basic monitoring is enabled. For more information,
   see Monitoring Your Instances
   and Volumes in the Amazon Elastic Compute Cloud User Guide.


   To disable detailed monitoring, see .

  monitor-instances-request - `com.amazonaws.services.ec2.model.MonitorInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MonitorInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.MonitorInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.MonitorInstancesRequest monitor-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.monitorInstancesAsync monitor-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.MonitorInstancesRequest monitor-instances-request]
    (-> this (.monitorInstancesAsync monitor-instances-request))))

(defn describe-spot-fleet-request-history-async
  "Describes the events for the specified Spot Fleet request during the specified time.


   Spot Fleet events are delayed by up to 30 seconds before they can be described. This ensures that you can query
   by the last evaluated time and not miss a recorded event. Spot Fleet events are available for 48 hours.

  describe-spot-fleet-request-history-request - Contains the parameters for DescribeSpotFleetRequestHistory. - `com.amazonaws.services.ec2.model.DescribeSpotFleetRequestHistoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSpotFleetRequestHistory operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeSpotFleetRequestHistoryResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeSpotFleetRequestHistoryRequest describe-spot-fleet-request-history-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSpotFleetRequestHistoryAsync describe-spot-fleet-request-history-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeSpotFleetRequestHistoryRequest describe-spot-fleet-request-history-request]
    (-> this (.describeSpotFleetRequestHistoryAsync describe-spot-fleet-request-history-request))))

(defn get-transit-gateway-route-table-associations-async
  "Gets information about the associations for the specified transit gateway route table.

  get-transit-gateway-route-table-associations-request - `com.amazonaws.services.ec2.model.GetTransitGatewayRouteTableAssociationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTransitGatewayRouteTableAssociations operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetTransitGatewayRouteTableAssociationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetTransitGatewayRouteTableAssociationsRequest get-transit-gateway-route-table-associations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTransitGatewayRouteTableAssociationsAsync get-transit-gateway-route-table-associations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetTransitGatewayRouteTableAssociationsRequest get-transit-gateway-route-table-associations-request]
    (-> this (.getTransitGatewayRouteTableAssociationsAsync get-transit-gateway-route-table-associations-request))))

(defn associate-transit-gateway-route-table-async
  "Associates the specified attachment with the specified transit gateway route table. You can associate only one
   route table with an attachment.

  associate-transit-gateway-route-table-request - `com.amazonaws.services.ec2.model.AssociateTransitGatewayRouteTableRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateTransitGatewayRouteTable operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AssociateTransitGatewayRouteTableResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AssociateTransitGatewayRouteTableRequest associate-transit-gateway-route-table-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateTransitGatewayRouteTableAsync associate-transit-gateway-route-table-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AssociateTransitGatewayRouteTableRequest associate-transit-gateway-route-table-request]
    (-> this (.associateTransitGatewayRouteTableAsync associate-transit-gateway-route-table-request))))

(defn describe-client-vpn-authorization-rules-async
  "Describes the authorization rules for a specified Client VPN endpoint.

  describe-client-vpn-authorization-rules-request - `com.amazonaws.services.ec2.model.DescribeClientVpnAuthorizationRulesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClientVpnAuthorizationRules operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeClientVpnAuthorizationRulesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeClientVpnAuthorizationRulesRequest describe-client-vpn-authorization-rules-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClientVpnAuthorizationRulesAsync describe-client-vpn-authorization-rules-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeClientVpnAuthorizationRulesRequest describe-client-vpn-authorization-rules-request]
    (-> this (.describeClientVpnAuthorizationRulesAsync describe-client-vpn-authorization-rules-request))))

(defn describe-fpga-images-async
  "Describes the Amazon FPGA Images (AFIs) available to you. These include public AFIs, private AFIs that you own,
   and AFIs owned by other AWS accounts for which you have load permissions.

  describe-fpga-images-request - `com.amazonaws.services.ec2.model.DescribeFpgaImagesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFpgaImages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeFpgaImagesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeFpgaImagesRequest describe-fpga-images-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFpgaImagesAsync describe-fpga-images-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeFpgaImagesRequest describe-fpga-images-request]
    (-> this (.describeFpgaImagesAsync describe-fpga-images-request))))

(defn accept-vpc-peering-connection-async
  "Accept a VPC peering connection request. To accept a request, the VPC peering connection must be in the
   pending-acceptance state, and you must be the owner of the peer VPC. Use
   DescribeVpcPeeringConnections to view your outstanding VPC peering connection requests.


   For an inter-Region VPC peering connection request, you must accept the VPC peering connection in the Region of
   the accepter VPC.

  accept-vpc-peering-connection-request - `com.amazonaws.services.ec2.model.AcceptVpcPeeringConnectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptVpcPeeringConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AcceptVpcPeeringConnectionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AcceptVpcPeeringConnectionRequest accept-vpc-peering-connection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptVpcPeeringConnectionAsync accept-vpc-peering-connection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AcceptVpcPeeringConnectionRequest accept-vpc-peering-connection-request]
    (-> this (.acceptVpcPeeringConnectionAsync accept-vpc-peering-connection-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.acceptVpcPeeringConnectionAsync))))

(defn describe-elastic-gpus-async
  "Describes the Elastic Graphics accelerator associated with your instances. For more information about Elastic
   Graphics, see Amazon
   Elastic Graphics.

  describe-elastic-gpus-request - `com.amazonaws.services.ec2.model.DescribeElasticGpusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeElasticGpus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeElasticGpusResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeElasticGpusRequest describe-elastic-gpus-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeElasticGpusAsync describe-elastic-gpus-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeElasticGpusRequest describe-elastic-gpus-request]
    (-> this (.describeElasticGpusAsync describe-elastic-gpus-request))))

(defn enable-transit-gateway-route-table-propagation-async
  "Enables the specified attachment to propagate routes to the specified propagation route table.

  enable-transit-gateway-route-table-propagation-request - `com.amazonaws.services.ec2.model.EnableTransitGatewayRouteTablePropagationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableTransitGatewayRouteTablePropagation operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.EnableTransitGatewayRouteTablePropagationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.EnableTransitGatewayRouteTablePropagationRequest enable-transit-gateway-route-table-propagation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableTransitGatewayRouteTablePropagationAsync enable-transit-gateway-route-table-propagation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.EnableTransitGatewayRouteTablePropagationRequest enable-transit-gateway-route-table-propagation-request]
    (-> this (.enableTransitGatewayRouteTablePropagationAsync enable-transit-gateway-route-table-propagation-request))))

(defn describe-spot-price-history-async
  "Describes the Spot price history. For more information, see Spot Instance
   Pricing History in the Amazon EC2 User Guide for Linux Instances.


   When you specify a start and end time, this operation returns the prices of the instance types within the time
   range that you specified and the time when the price changed. The price is valid within the time period that you
   specified; the response merely indicates the last time that the price changed.

  describe-spot-price-history-request - Contains the parameters for DescribeSpotPriceHistory. - `com.amazonaws.services.ec2.model.DescribeSpotPriceHistoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSpotPriceHistory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeSpotPriceHistoryResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeSpotPriceHistoryRequest describe-spot-price-history-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSpotPriceHistoryAsync describe-spot-price-history-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeSpotPriceHistoryRequest describe-spot-price-history-request]
    (-> this (.describeSpotPriceHistoryAsync describe-spot-price-history-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeSpotPriceHistoryAsync))))

(defn import-volume-async
  "Creates an import volume task using metadata from the specified disk image.For more information, see Importing Disks to Amazon EBS.


   For information about the import manifest referenced by this API action, see VM Import Manifest.

  import-volume-request - `com.amazonaws.services.ec2.model.ImportVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ImportVolumeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ImportVolumeRequest import-volume-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importVolumeAsync import-volume-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ImportVolumeRequest import-volume-request]
    (-> this (.importVolumeAsync import-volume-request))))

(defn modify-vpc-attribute-async
  "Modifies the specified attribute of the specified VPC.

  modify-vpc-attribute-request - `com.amazonaws.services.ec2.model.ModifyVpcAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyVpcAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyVpcAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyVpcAttributeRequest modify-vpc-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyVpcAttributeAsync modify-vpc-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyVpcAttributeRequest modify-vpc-attribute-request]
    (-> this (.modifyVpcAttributeAsync modify-vpc-attribute-request))))

(defn describe-network-interface-permissions-async
  "Describes the permissions for your network interfaces.

  describe-network-interface-permissions-request - Contains the parameters for DescribeNetworkInterfacePermissions. - `com.amazonaws.services.ec2.model.DescribeNetworkInterfacePermissionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNetworkInterfacePermissions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeNetworkInterfacePermissionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeNetworkInterfacePermissionsRequest describe-network-interface-permissions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNetworkInterfacePermissionsAsync describe-network-interface-permissions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeNetworkInterfacePermissionsRequest describe-network-interface-permissions-request]
    (-> this (.describeNetworkInterfacePermissionsAsync describe-network-interface-permissions-request))))

(defn modify-snapshot-attribute-async
  "Adds or removes permission settings for the specified snapshot. You may add or remove specified AWS account IDs
   from a snapshot's list of create volume permissions, but you cannot do both in a single operation. If you need to
   both add and remove account IDs for a snapshot, you must use multiple operations.


   Encrypted snapshots and snapshots with AWS Marketplace product codes cannot be made public. Snapshots encrypted
   with your default CMK cannot be shared with other accounts.


   For more information about modifying snapshot permissions, see Sharing
   Snapshots in the Amazon Elastic Compute Cloud User Guide.

  modify-snapshot-attribute-request - Contains the parameters for ModifySnapshotAttribute. - `com.amazonaws.services.ec2.model.ModifySnapshotAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifySnapshotAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifySnapshotAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifySnapshotAttributeRequest modify-snapshot-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifySnapshotAttributeAsync modify-snapshot-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifySnapshotAttributeRequest modify-snapshot-attribute-request]
    (-> this (.modifySnapshotAttributeAsync modify-snapshot-attribute-request))))

(defn modify-instance-attribute-async
  "Modifies the specified attribute of the specified instance. You can specify only one attribute at a time.


   Note: Using this action to change the security groups associated with an elastic network interface (ENI)
   attached to an instance in a VPC can result in an error if the instance has more than one ENI. To change the
   security groups associated with an ENI attached to an instance that has multiple ENIs, we recommend that you use
   the ModifyNetworkInterfaceAttribute action.


   To modify some attributes, the instance must be stopped. For more information, see Modifying Attributes of a Stopped Instance in the Amazon Elastic Compute Cloud User Guide.

  modify-instance-attribute-request - `com.amazonaws.services.ec2.model.ModifyInstanceAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyInstanceAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyInstanceAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyInstanceAttributeRequest modify-instance-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyInstanceAttributeAsync modify-instance-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyInstanceAttributeRequest modify-instance-attribute-request]
    (-> this (.modifyInstanceAttributeAsync modify-instance-attribute-request))))

(defn modify-traffic-mirror-session-async
  "Modifies a Traffic Mirror session.

  modify-traffic-mirror-session-request - `com.amazonaws.services.ec2.model.ModifyTrafficMirrorSessionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyTrafficMirrorSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyTrafficMirrorSessionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyTrafficMirrorSessionRequest modify-traffic-mirror-session-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyTrafficMirrorSessionAsync modify-traffic-mirror-session-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyTrafficMirrorSessionRequest modify-traffic-mirror-session-request]
    (-> this (.modifyTrafficMirrorSessionAsync modify-traffic-mirror-session-request))))

(defn create-vpc-endpoint-connection-notification-async
  "Creates a connection notification for a specified VPC endpoint or VPC endpoint service. A connection notification
   notifies you of specific endpoint events. You must create an SNS topic to receive notifications. For more
   information, see Create a Topic in the
   Amazon Simple Notification Service Developer Guide.


   You can create a connection notification for interface endpoints only.

  create-vpc-endpoint-connection-notification-request - `com.amazonaws.services.ec2.model.CreateVpcEndpointConnectionNotificationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVpcEndpointConnectionNotification operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateVpcEndpointConnectionNotificationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateVpcEndpointConnectionNotificationRequest create-vpc-endpoint-connection-notification-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVpcEndpointConnectionNotificationAsync create-vpc-endpoint-connection-notification-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateVpcEndpointConnectionNotificationRequest create-vpc-endpoint-connection-notification-request]
    (-> this (.createVpcEndpointConnectionNotificationAsync create-vpc-endpoint-connection-notification-request))))

(defn describe-scheduled-instance-availability-async
  "Finds available schedules that meet the specified criteria.


   You can search for an available schedule no more than 3 months in advance. You must meet the minimum required
   duration of 1,200 hours per year. For example, the minimum daily schedule is 4 hours, the minimum weekly schedule
   is 24 hours, and the minimum monthly schedule is 100 hours.


   After you find a schedule that meets your needs, call PurchaseScheduledInstances to purchase Scheduled
   Instances with that schedule.

  describe-scheduled-instance-availability-request - Contains the parameters for DescribeScheduledInstanceAvailability. - `com.amazonaws.services.ec2.model.DescribeScheduledInstanceAvailabilityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScheduledInstanceAvailability operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeScheduledInstanceAvailabilityResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeScheduledInstanceAvailabilityRequest describe-scheduled-instance-availability-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScheduledInstanceAvailabilityAsync describe-scheduled-instance-availability-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeScheduledInstanceAvailabilityRequest describe-scheduled-instance-availability-request]
    (-> this (.describeScheduledInstanceAvailabilityAsync describe-scheduled-instance-availability-request))))

(defn create-vpn-gateway-async
  "Creates a virtual private gateway. A virtual private gateway is the endpoint on the VPC side of your VPN
   connection. You can create a virtual private gateway before creating the VPC itself.


   For more information, see AWS Site-to-Site
   VPN in the AWS Site-to-Site VPN User Guide.

  create-vpn-gateway-request - Contains the parameters for CreateVpnGateway. - `com.amazonaws.services.ec2.model.CreateVpnGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVpnGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateVpnGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateVpnGatewayRequest create-vpn-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVpnGatewayAsync create-vpn-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateVpnGatewayRequest create-vpn-gateway-request]
    (-> this (.createVpnGatewayAsync create-vpn-gateway-request))))

(defn describe-traffic-mirror-sessions-async
  "Describes one or more Traffic Mirror sessions. By default, all Traffic Mirror sessions are described.
   Alternatively, you can filter the results.

  describe-traffic-mirror-sessions-request - `com.amazonaws.services.ec2.model.DescribeTrafficMirrorSessionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTrafficMirrorSessions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeTrafficMirrorSessionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeTrafficMirrorSessionsRequest describe-traffic-mirror-sessions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTrafficMirrorSessionsAsync describe-traffic-mirror-sessions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeTrafficMirrorSessionsRequest describe-traffic-mirror-sessions-request]
    (-> this (.describeTrafficMirrorSessionsAsync describe-traffic-mirror-sessions-request))))

(defn describe-instances-async
  "Describes the specified instances or all of AWS account's instances.


   If you specify one or more instance IDs, Amazon EC2 returns information for those instances. If you do not
   specify instance IDs, Amazon EC2 returns information for all relevant instances. If you specify an instance ID
   that is not valid, an error is returned. If you specify an instance that you do not own, it is not included in
   the returned results.


   Recently terminated instances might appear in the returned results. This interval is usually less than one hour.


   If you describe instances in the rare case where an Availability Zone is experiencing a service disruption and
   you specify instance IDs that are in the affected zone, or do not specify any instance IDs at all, the call
   fails. If you describe instances and specify only instance IDs that are in an unaffected zone, the call works
   normally.

  describe-instances-request - `com.amazonaws.services.ec2.model.DescribeInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeInstancesRequest describe-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstancesAsync describe-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeInstancesRequest describe-instances-request]
    (-> this (.describeInstancesAsync describe-instances-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeInstancesAsync))))

(defn enable-vpc-classic-link-dns-support-async
  "Enables a VPC to support DNS hostname resolution for ClassicLink. If enabled, the DNS hostname of a linked
   EC2-Classic instance resolves to its private IP address when addressed from an instance in the VPC to which it's
   linked. Similarly, the DNS hostname of an instance in a VPC resolves to its private IP address when addressed
   from a linked EC2-Classic instance. For more information, see ClassicLink in the Amazon
   Elastic Compute Cloud User Guide.

  enable-vpc-classic-link-dns-support-request - `com.amazonaws.services.ec2.model.EnableVpcClassicLinkDnsSupportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableVpcClassicLinkDnsSupport operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.EnableVpcClassicLinkDnsSupportResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.EnableVpcClassicLinkDnsSupportRequest enable-vpc-classic-link-dns-support-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableVpcClassicLinkDnsSupportAsync enable-vpc-classic-link-dns-support-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.EnableVpcClassicLinkDnsSupportRequest enable-vpc-classic-link-dns-support-request]
    (-> this (.enableVpcClassicLinkDnsSupportAsync enable-vpc-classic-link-dns-support-request))))

(defn create-vpn-connection-route-async
  "Creates a static route associated with a VPN connection between an existing virtual private gateway and a VPN
   customer gateway. The static route allows traffic to be routed from the virtual private gateway to the VPN
   customer gateway.


   For more information, see AWS Site-to-Site
   VPN in the AWS Site-to-Site VPN User Guide.

  create-vpn-connection-route-request - Contains the parameters for CreateVpnConnectionRoute. - `com.amazonaws.services.ec2.model.CreateVpnConnectionRouteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVpnConnectionRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateVpnConnectionRouteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateVpnConnectionRouteRequest create-vpn-connection-route-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVpnConnectionRouteAsync create-vpn-connection-route-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateVpnConnectionRouteRequest create-vpn-connection-route-request]
    (-> this (.createVpnConnectionRouteAsync create-vpn-connection-route-request))))

(defn enable-vgw-route-propagation-async
  "Enables a virtual private gateway (VGW) to propagate routes to the specified route table of a VPC.

  enable-vgw-route-propagation-request - Contains the parameters for EnableVgwRoutePropagation. - `com.amazonaws.services.ec2.model.EnableVgwRoutePropagationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableVgwRoutePropagation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.EnableVgwRoutePropagationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.EnableVgwRoutePropagationRequest enable-vgw-route-propagation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableVgwRoutePropagationAsync enable-vgw-route-propagation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.EnableVgwRoutePropagationRequest enable-vgw-route-propagation-request]
    (-> this (.enableVgwRoutePropagationAsync enable-vgw-route-propagation-request))))

(defn describe-vpcs-async
  "Describes one or more of your VPCs.

  describe-vpcs-request - `com.amazonaws.services.ec2.model.DescribeVpcsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpcsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpcsRequest describe-vpcs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcsAsync describe-vpcs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpcsRequest describe-vpcs-request]
    (-> this (.describeVpcsAsync describe-vpcs-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeVpcsAsync))))

(defn describe-fleets-async
  "Describes the specified EC2 Fleets or all your EC2 Fleets.

  describe-fleets-request - `com.amazonaws.services.ec2.model.DescribeFleetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFleets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeFleetsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeFleetsRequest describe-fleets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFleetsAsync describe-fleets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeFleetsRequest describe-fleets-request]
    (-> this (.describeFleetsAsync describe-fleets-request))))

(defn describe-instance-credit-specifications-async
  "Describes the credit option for CPU usage of the specified T2 or T3 instances. The credit options are
   standard and unlimited.


   If you do not specify an instance ID, Amazon EC2 returns T2 and T3 instances with the unlimited
   credit option, as well as instances that were previously configured as T2 or T3 with the unlimited
   credit option. For example, if you resize a T2 instance, while it is configured as unlimited, to an
   M4 instance, Amazon EC2 returns the M4 instance.


   If you specify one or more instance IDs, Amazon EC2 returns the credit option (standard or
   unlimited) of those instances. If you specify an instance ID that is not valid, such as an instance
   that is not a T2 or T3 instance, an error is returned.


   Recently terminated instances might appear in the returned results. This interval is usually less than one hour.


   If an Availability Zone is experiencing a service disruption and you specify instance IDs in the affected zone,
   or do not specify any instance IDs at all, the call fails. If you specify only instance IDs in an unaffected
   zone, the call works normally.


   For more information, see Burstable
   Performance Instances in the Amazon Elastic Compute Cloud User Guide.

  describe-instance-credit-specifications-request - `com.amazonaws.services.ec2.model.DescribeInstanceCreditSpecificationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstanceCreditSpecifications operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeInstanceCreditSpecificationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeInstanceCreditSpecificationsRequest describe-instance-credit-specifications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstanceCreditSpecificationsAsync describe-instance-credit-specifications-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeInstanceCreditSpecificationsRequest describe-instance-credit-specifications-request]
    (-> this (.describeInstanceCreditSpecificationsAsync describe-instance-credit-specifications-request))))

(defn delete-tags-async
  "Deletes the specified set of tags from the specified set of resources.


   To list the current tags, use DescribeTags. For more information about tags, see Tagging Your Resources in the
   Amazon Elastic Compute Cloud User Guide.

  delete-tags-request - `com.amazonaws.services.ec2.model.DeleteTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteTagsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteTagsRequest delete-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagsAsync delete-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteTagsRequest delete-tags-request]
    (-> this (.deleteTagsAsync delete-tags-request))))

(defn withdraw-byoip-cidr-async
  "Stops advertising an IPv4 address range that is provisioned as an address pool.


   You can perform this operation at most once every 10 seconds, even if you specify different address ranges each
   time.


   It can take a few minutes before traffic to the specified addresses stops routing to AWS because of BGP
   propagation delays.

  withdraw-byoip-cidr-request - `com.amazonaws.services.ec2.model.WithdrawByoipCidrRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the WithdrawByoipCidr operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.WithdrawByoipCidrResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.WithdrawByoipCidrRequest withdraw-byoip-cidr-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.withdrawByoipCidrAsync withdraw-byoip-cidr-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.WithdrawByoipCidrRequest withdraw-byoip-cidr-request]
    (-> this (.withdrawByoipCidrAsync withdraw-byoip-cidr-request))))

(defn create-launch-template-version-async
  "Creates a new version for a launch template. You can specify an existing version of launch template from which to
   base the new version.


   Launch template versions are numbered in the order in which they are created. You cannot specify, change, or
   replace the numbering of launch template versions.

  create-launch-template-version-request - `com.amazonaws.services.ec2.model.CreateLaunchTemplateVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLaunchTemplateVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateLaunchTemplateVersionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateLaunchTemplateVersionRequest create-launch-template-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLaunchTemplateVersionAsync create-launch-template-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateLaunchTemplateVersionRequest create-launch-template-version-request]
    (-> this (.createLaunchTemplateVersionAsync create-launch-template-version-request))))

(defn describe-snapshot-attribute-async
  "Describes the specified attribute of the specified snapshot. You can specify only one attribute at a time.


   For more information about EBS snapshots, see Amazon EBS Snapshots in the
   Amazon Elastic Compute Cloud User Guide.

  describe-snapshot-attribute-request - Contains the parameters for DescribeSnapshotAttribute. - `com.amazonaws.services.ec2.model.DescribeSnapshotAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSnapshotAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeSnapshotAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeSnapshotAttributeRequest describe-snapshot-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSnapshotAttributeAsync describe-snapshot-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeSnapshotAttributeRequest describe-snapshot-attribute-request]
    (-> this (.describeSnapshotAttributeAsync describe-snapshot-attribute-request))))

(defn start-instances-async
  "Starts an Amazon EBS-backed instance that you've previously stopped.


   Instances that use Amazon EBS volumes as their root devices can be quickly stopped and started. When an instance
   is stopped, the compute resources are released and you are not billed for instance usage. However, your root
   partition Amazon EBS volume remains and continues to persist your data, and you are charged for Amazon EBS volume
   usage. You can restart your instance at any time. Every time you start your Windows instance, Amazon EC2 charges
   you for a full instance hour. If you stop and restart your Windows instance, a new instance hour begins and
   Amazon EC2 charges you for another full instance hour even if you are still within the same 60-minute period when
   it was stopped. Every time you start your Linux instance, Amazon EC2 charges a one-minute minimum for instance
   usage, and thereafter charges per second for instance usage.


   Before stopping an instance, make sure it is in a state from which it can be restarted. Stopping an instance does
   not preserve data stored in RAM.


   Performing this operation on an instance that uses an instance store as its root device returns an error.


   For more information, see Stopping
   Instances in the Amazon Elastic Compute Cloud User Guide.

  start-instances-request - `com.amazonaws.services.ec2.model.StartInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.StartInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.StartInstancesRequest start-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startInstancesAsync start-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.StartInstancesRequest start-instances-request]
    (-> this (.startInstancesAsync start-instances-request))))

(defn cancel-import-task-async
  "Cancels an in-process import virtual machine or import snapshot task.

  cancel-import-task-request - `com.amazonaws.services.ec2.model.CancelImportTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelImportTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CancelImportTaskResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CancelImportTaskRequest cancel-import-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelImportTaskAsync cancel-import-task-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CancelImportTaskRequest cancel-import-task-request]
    (-> this (.cancelImportTaskAsync cancel-import-task-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.cancelImportTaskAsync))))

(defn get-host-reservation-purchase-preview-async
  "Preview a reservation purchase with configurations that match those of your Dedicated Host. You must have active
   Dedicated Hosts in your account before you purchase a reservation.


   This is a preview of the PurchaseHostReservation action and does not result in the offering being
   purchased.

  get-host-reservation-purchase-preview-request - `com.amazonaws.services.ec2.model.GetHostReservationPurchasePreviewRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetHostReservationPurchasePreview operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetHostReservationPurchasePreviewResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetHostReservationPurchasePreviewRequest get-host-reservation-purchase-preview-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getHostReservationPurchasePreviewAsync get-host-reservation-purchase-preview-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetHostReservationPurchasePreviewRequest get-host-reservation-purchase-preview-request]
    (-> this (.getHostReservationPurchasePreviewAsync get-host-reservation-purchase-preview-request))))

(defn describe-network-interface-attribute-async
  "Describes a network interface attribute. You can specify only one attribute at a time.

  describe-network-interface-attribute-request - Contains the parameters for DescribeNetworkInterfaceAttribute. - `com.amazonaws.services.ec2.model.DescribeNetworkInterfaceAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNetworkInterfaceAttribute operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeNetworkInterfaceAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeNetworkInterfaceAttributeRequest describe-network-interface-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNetworkInterfaceAttributeAsync describe-network-interface-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeNetworkInterfaceAttributeRequest describe-network-interface-attribute-request]
    (-> this (.describeNetworkInterfaceAttributeAsync describe-network-interface-attribute-request))))

(defn modify-vpn-connection-async
  "Modifies the target gateway of a AWS Site-to-Site VPN connection. The following migration options are available:




   An existing virtual private gateway to a new virtual private gateway




   An existing virtual private gateway to a transit gateway




   An existing transit gateway to a new transit gateway




   An existing transit gateway to a virtual private gateway




   Before you perform the migration to the new gateway, you must configure the new gateway. Use
   CreateVpnGateway to create a virtual private gateway, or CreateTransitGateway to create a transit
   gateway.


   This step is required when you migrate from a virtual private gateway with static routes to a transit gateway.


   You must delete the static routes before you migrate to the new gateway.


   Keep a copy of the static route before you delete it. You will need to add back these routes to the transit
   gateway after the VPN connection migration is complete.


   After you migrate to the new gateway, you might need to modify your VPC route table. Use CreateRoute and
   DeleteRoute to make the changes described in VPN Gateway
   Target Modification Required VPC Route Table Updates in the AWS Site-to-Site VPN User Guide.


   When the new gateway is a transit gateway, modify the transit gateway route table to allow traffic between the
   VPC and the AWS Site-to-Site VPN connection. Use CreateTransitGatewayRoute to add the routes.


   If you deleted VPN static routes, you must add the static routes to the transit gateway route table.


   After you perform this operation, the AWS VPN endpoint's IP addresses on the AWS side and the tunnel options
   remain intact. Your s2slong; connection will be temporarily unavailable for approximately 10 minutes while we
   provision the new endpoints

  modify-vpn-connection-request - `com.amazonaws.services.ec2.model.ModifyVpnConnectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyVpnConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyVpnConnectionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyVpnConnectionRequest modify-vpn-connection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyVpnConnectionAsync modify-vpn-connection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyVpnConnectionRequest modify-vpn-connection-request]
    (-> this (.modifyVpnConnectionAsync modify-vpn-connection-request))))

(defn describe-security-groups-async
  "Describes the specified security groups or all of your security groups.


   A security group is for use with instances either in the EC2-Classic platform or in a specific VPC. For more
   information, see Amazon
   EC2 Security Groups in the Amazon Elastic Compute Cloud User Guide and Security Groups for Your
   VPC in the Amazon Virtual Private Cloud User Guide.

  describe-security-groups-request - `com.amazonaws.services.ec2.model.DescribeSecurityGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSecurityGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeSecurityGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeSecurityGroupsRequest describe-security-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSecurityGroupsAsync describe-security-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeSecurityGroupsRequest describe-security-groups-request]
    (-> this (.describeSecurityGroupsAsync describe-security-groups-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeSecurityGroupsAsync))))

(defn describe-transit-gateway-route-tables-async
  "Describes one or more transit gateway route tables. By default, all transit gateway route tables are described.
   Alternatively, you can filter the results.

  describe-transit-gateway-route-tables-request - `com.amazonaws.services.ec2.model.DescribeTransitGatewayRouteTablesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTransitGatewayRouteTables operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeTransitGatewayRouteTablesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeTransitGatewayRouteTablesRequest describe-transit-gateway-route-tables-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTransitGatewayRouteTablesAsync describe-transit-gateway-route-tables-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeTransitGatewayRouteTablesRequest describe-transit-gateway-route-tables-request]
    (-> this (.describeTransitGatewayRouteTablesAsync describe-transit-gateway-route-tables-request))))

(defn attach-network-interface-async
  "Attaches a network interface to an instance.

  attach-network-interface-request - Contains the parameters for AttachNetworkInterface. - `com.amazonaws.services.ec2.model.AttachNetworkInterfaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachNetworkInterface operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AttachNetworkInterfaceResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AttachNetworkInterfaceRequest attach-network-interface-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachNetworkInterfaceAsync attach-network-interface-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AttachNetworkInterfaceRequest attach-network-interface-request]
    (-> this (.attachNetworkInterfaceAsync attach-network-interface-request))))

(defn get-console-screenshot-async
  "Retrieve a JPG-format screenshot of a running instance to help with troubleshooting.


   The returned content is Base64-encoded.

  get-console-screenshot-request - `com.amazonaws.services.ec2.model.GetConsoleScreenshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConsoleScreenshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetConsoleScreenshotResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetConsoleScreenshotRequest get-console-screenshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConsoleScreenshotAsync get-console-screenshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetConsoleScreenshotRequest get-console-screenshot-request]
    (-> this (.getConsoleScreenshotAsync get-console-screenshot-request))))

(defn describe-security-group-references-async
  "[VPC only] Describes the VPCs on the other side of a VPC peering connection that are referencing the security
   groups you've specified in this request.

  describe-security-group-references-request - `com.amazonaws.services.ec2.model.DescribeSecurityGroupReferencesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSecurityGroupReferences operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeSecurityGroupReferencesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeSecurityGroupReferencesRequest describe-security-group-references-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSecurityGroupReferencesAsync describe-security-group-references-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeSecurityGroupReferencesRequest describe-security-group-references-request]
    (-> this (.describeSecurityGroupReferencesAsync describe-security-group-references-request))))

(defn detach-network-interface-async
  "Detaches a network interface from an instance.

  detach-network-interface-request - Contains the parameters for DetachNetworkInterface. - `com.amazonaws.services.ec2.model.DetachNetworkInterfaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachNetworkInterface operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DetachNetworkInterfaceResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DetachNetworkInterfaceRequest detach-network-interface-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachNetworkInterfaceAsync detach-network-interface-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DetachNetworkInterfaceRequest detach-network-interface-request]
    (-> this (.detachNetworkInterfaceAsync detach-network-interface-request))))

(defn enable-vpc-classic-link-async
  "Enables a VPC for ClassicLink. You can then link EC2-Classic instances to your ClassicLink-enabled VPC to allow
   communication over private IP addresses. You cannot enable your VPC for ClassicLink if any of your VPC route
   tables have existing routes for address ranges within the 10.0.0.0/8 IP address range, excluding
   local routes for VPCs in the 10.0.0.0/16 and 10.1.0.0/16 IP address ranges. For more
   information, see ClassicLink in the Amazon
   Elastic Compute Cloud User Guide.

  enable-vpc-classic-link-request - `com.amazonaws.services.ec2.model.EnableVpcClassicLinkRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableVpcClassicLink operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.EnableVpcClassicLinkResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.EnableVpcClassicLinkRequest enable-vpc-classic-link-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableVpcClassicLinkAsync enable-vpc-classic-link-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.EnableVpcClassicLinkRequest enable-vpc-classic-link-request]
    (-> this (.enableVpcClassicLinkAsync enable-vpc-classic-link-request))))

(defn create-vpn-connection-async
  "Creates a VPN connection between an existing virtual private gateway and a VPN customer gateway. The supported
   connection types is ipsec.1.


   The response includes information that you need to give to your network administrator to configure your customer
   gateway.



   We strongly recommend that you use HTTPS when calling this operation because the response contains sensitive
   cryptographic information for configuring your customer gateway.



   If you decide to shut down your VPN connection for any reason and later create a new VPN connection, you must
   reconfigure your customer gateway with the new information returned from this call.


   This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error.


   For more information, see AWS Site-to-Site
   VPN in the AWS Site-to-Site VPN User Guide.

  create-vpn-connection-request - Contains the parameters for CreateVpnConnection. - `com.amazonaws.services.ec2.model.CreateVpnConnectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVpnConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateVpnConnectionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateVpnConnectionRequest create-vpn-connection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVpnConnectionAsync create-vpn-connection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateVpnConnectionRequest create-vpn-connection-request]
    (-> this (.createVpnConnectionAsync create-vpn-connection-request))))

(defn modify-identity-id-format-async
  "Modifies the ID format of a resource for a specified IAM user, IAM role, or the root user for an account; or all
   IAM users, IAM roles, and the root user for an account. You can specify that resources should receive longer IDs
   (17-character IDs) when they are created.


   This request can only be used to modify longer ID settings for resource types that are within the opt-in period.
   Resources currently in their opt-in period include: bundle | conversion-task |
   customer-gateway | dhcp-options | elastic-ip-allocation |
   elastic-ip-association | export-task | flow-log | image |
   import-task | internet-gateway | network-acl |
   network-acl-association | network-interface | network-interface-attachment
   | prefix-list | route-table | route-table-association |
   security-group | subnet | subnet-cidr-block-association | vpc
   | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection |
   vpn-connection | vpn-gateway.


   For more information, see Resource IDs in the Amazon
   Elastic Compute Cloud User Guide.


   This setting applies to the principal specified in the request; it does not apply to the principal that makes the
   request.


   Resources created with longer IDs are visible to all IAM roles and users, regardless of these settings and
   provided that they have permission to use the relevant Describe command for the resource type.

  modify-identity-id-format-request - `com.amazonaws.services.ec2.model.ModifyIdentityIdFormatRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyIdentityIdFormat operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyIdentityIdFormatResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyIdentityIdFormatRequest modify-identity-id-format-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyIdentityIdFormatAsync modify-identity-id-format-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyIdentityIdFormatRequest modify-identity-id-format-request]
    (-> this (.modifyIdentityIdFormatAsync modify-identity-id-format-request))))

(defn create-security-group-async
  "Creates a security group.


   A security group acts as a virtual firewall for your instance to control inbound and outbound traffic. For more
   information, see Amazon
   EC2 Security Groups in the Amazon Elastic Compute Cloud User Guide and Security Groups for Your
   VPC in the Amazon Virtual Private Cloud User Guide.


   When you create a security group, you specify a friendly name of your choice. You can have a security group for
   use in EC2-Classic with the same name as a security group for use in a VPC. However, you can't have two security
   groups for use in EC2-Classic with the same name or two security groups for use in a VPC with the same name.


   You have a default security group for use in EC2-Classic and a default security group for use in your VPC. If you
   don't specify a security group when you launch an instance, the instance is launched into the appropriate default
   security group. A default security group includes a default rule that grants instances unrestricted network
   access to each other.


   You can add or remove rules from your security groups using AuthorizeSecurityGroupIngress,
   AuthorizeSecurityGroupEgress, RevokeSecurityGroupIngress, and RevokeSecurityGroupEgress.


   For more information about VPC security group limits, see Amazon VPC Limits.

  create-security-group-request - `com.amazonaws.services.ec2.model.CreateSecurityGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateSecurityGroupResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateSecurityGroupRequest create-security-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSecurityGroupAsync create-security-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateSecurityGroupRequest create-security-group-request]
    (-> this (.createSecurityGroupAsync create-security-group-request))))

(defn describe-scheduled-instances-async
  "Describes the specified Scheduled Instances or all your Scheduled Instances.

  describe-scheduled-instances-request - Contains the parameters for DescribeScheduledInstances. - `com.amazonaws.services.ec2.model.DescribeScheduledInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScheduledInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeScheduledInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeScheduledInstancesRequest describe-scheduled-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScheduledInstancesAsync describe-scheduled-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeScheduledInstancesRequest describe-scheduled-instances-request]
    (-> this (.describeScheduledInstancesAsync describe-scheduled-instances-request))))

(defn export-client-vpn-client-configuration-async
  "Downloads the contents of the Client VPN endpoint configuration file for the specified Client VPN endpoint. The
   Client VPN endpoint configuration file includes the Client VPN endpoint and certificate information clients need
   to establish a connection with the Client VPN endpoint.

  export-client-vpn-client-configuration-request - `com.amazonaws.services.ec2.model.ExportClientVpnClientConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExportClientVpnClientConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ExportClientVpnClientConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ExportClientVpnClientConfigurationRequest export-client-vpn-client-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.exportClientVpnClientConfigurationAsync export-client-vpn-client-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ExportClientVpnClientConfigurationRequest export-client-vpn-client-configuration-request]
    (-> this (.exportClientVpnClientConfigurationAsync export-client-vpn-client-configuration-request))))

(defn authorize-client-vpn-ingress-async
  "Adds an ingress authorization rule to a Client VPN endpoint. Ingress authorization rules act as firewall rules
   that grant access to networks. You must configure ingress authorization rules to enable clients to access
   resources in AWS or on-premises networks.

  authorize-client-vpn-ingress-request - `com.amazonaws.services.ec2.model.AuthorizeClientVpnIngressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AuthorizeClientVpnIngress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AuthorizeClientVpnIngressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AuthorizeClientVpnIngressRequest authorize-client-vpn-ingress-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.authorizeClientVpnIngressAsync authorize-client-vpn-ingress-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AuthorizeClientVpnIngressRequest authorize-client-vpn-ingress-request]
    (-> this (.authorizeClientVpnIngressAsync authorize-client-vpn-ingress-request))))

(defn cancel-bundle-task-async
  "Cancels a bundling operation for an instance store-backed Windows instance.

  cancel-bundle-task-request - Contains the parameters for CancelBundleTask. - `com.amazonaws.services.ec2.model.CancelBundleTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelBundleTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CancelBundleTaskResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CancelBundleTaskRequest cancel-bundle-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelBundleTaskAsync cancel-bundle-task-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CancelBundleTaskRequest cancel-bundle-task-request]
    (-> this (.cancelBundleTaskAsync cancel-bundle-task-request))))

(defn describe-vpn-connections-async
  "Describes one or more of your VPN connections.


   For more information, see AWS Site-to-Site
   VPN in the AWS Site-to-Site VPN User Guide.

  describe-vpn-connections-request - Contains the parameters for DescribeVpnConnections. - `com.amazonaws.services.ec2.model.DescribeVpnConnectionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpnConnections operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpnConnectionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpnConnectionsRequest describe-vpn-connections-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpnConnectionsAsync describe-vpn-connections-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpnConnectionsRequest describe-vpn-connections-request]
    (-> this (.describeVpnConnectionsAsync describe-vpn-connections-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeVpnConnectionsAsync))))

(defn replace-network-acl-entry-async
  "Replaces an entry (rule) in a network ACL. For more information, see Network ACLs in the Amazon Virtual
   Private Cloud User Guide.

  replace-network-acl-entry-request - `com.amazonaws.services.ec2.model.ReplaceNetworkAclEntryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReplaceNetworkAclEntry operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ReplaceNetworkAclEntryResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ReplaceNetworkAclEntryRequest replace-network-acl-entry-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.replaceNetworkAclEntryAsync replace-network-acl-entry-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ReplaceNetworkAclEntryRequest replace-network-acl-entry-request]
    (-> this (.replaceNetworkAclEntryAsync replace-network-acl-entry-request))))

(defn describe-launch-templates-async
  "Describes one or more launch templates.

  describe-launch-templates-request - `com.amazonaws.services.ec2.model.DescribeLaunchTemplatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLaunchTemplates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeLaunchTemplatesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeLaunchTemplatesRequest describe-launch-templates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLaunchTemplatesAsync describe-launch-templates-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeLaunchTemplatesRequest describe-launch-templates-request]
    (-> this (.describeLaunchTemplatesAsync describe-launch-templates-request))))

(defn create-key-pair-async
  "Creates a 2048-bit RSA key pair with the specified name. Amazon EC2 stores the public key and displays the
   private key for you to save to a file. The private key is returned as an unencrypted PEM encoded PKCS#1 private
   key. If a key with the specified name already exists, Amazon EC2 returns an error.


   You can have up to five thousand key pairs per Region.


   The key pair returned to you is available only in the Region in which you create it. If you prefer, you can
   create your own key pair using a third-party tool and upload it to any Region using ImportKeyPair.


   For more information, see Key
   Pairs in the Amazon Elastic Compute Cloud User Guide.

  create-key-pair-request - `com.amazonaws.services.ec2.model.CreateKeyPairRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateKeyPair operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateKeyPairResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateKeyPairRequest create-key-pair-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createKeyPairAsync create-key-pair-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateKeyPairRequest create-key-pair-request]
    (-> this (.createKeyPairAsync create-key-pair-request))))

(defn delete-internet-gateway-async
  "Deletes the specified internet gateway. You must detach the internet gateway from the VPC before you can delete
   it.

  delete-internet-gateway-request - `com.amazonaws.services.ec2.model.DeleteInternetGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInternetGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteInternetGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteInternetGatewayRequest delete-internet-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInternetGatewayAsync delete-internet-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteInternetGatewayRequest delete-internet-gateway-request]
    (-> this (.deleteInternetGatewayAsync delete-internet-gateway-request))))

(defn delete-traffic-mirror-session-async
  "Deletes the specified Traffic Mirror session.

  delete-traffic-mirror-session-request - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorSessionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTrafficMirrorSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteTrafficMirrorSessionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorSessionRequest delete-traffic-mirror-session-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTrafficMirrorSessionAsync delete-traffic-mirror-session-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorSessionRequest delete-traffic-mirror-session-request]
    (-> this (.deleteTrafficMirrorSessionAsync delete-traffic-mirror-session-request))))

(defn create-snapshots-async
  "Creates crash-consistent snapshots of multiple EBS volumes and stores the data in S3. Volumes are chosen by
   specifying an instance. Any attached volumes will produce one snapshot each that is crash-consistent across the
   instance. Boot volumes can be excluded by changing the paramaters.

  create-snapshots-request - `com.amazonaws.services.ec2.model.CreateSnapshotsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateSnapshotsRequest create-snapshots-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSnapshotsAsync create-snapshots-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateSnapshotsRequest create-snapshots-request]
    (-> this (.createSnapshotsAsync create-snapshots-request))))

(defn create-placement-group-async
  "Creates a placement group in which to launch instances. The strategy of the placement group determines how the
   instances are organized within the group.


   A cluster placement group is a logical grouping of instances within a single Availability Zone that
   benefit from low network latency, high network throughput. A spread placement group places instances
   on distinct hardware. A partition placement group places groups of instances in different
   partitions, where instances in one partition do not share the same hardware with instances in another partition.


   For more information, see Placement Groups in the
   Amazon Elastic Compute Cloud User Guide.

  create-placement-group-request - `com.amazonaws.services.ec2.model.CreatePlacementGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePlacementGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreatePlacementGroupResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreatePlacementGroupRequest create-placement-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPlacementGroupAsync create-placement-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreatePlacementGroupRequest create-placement-group-request]
    (-> this (.createPlacementGroupAsync create-placement-group-request))))

(defn describe-images-async
  "Describes the specified images (AMIs, AKIs, and ARIs) available to you or all of the images available to you.


   The images available to you include public images, private images that you own, and private images owned by other
   AWS accounts for which you have explicit launch permissions.


   Recently deregistered images appear in the returned results for a short interval and then return empty results.
   After all instances that reference a deregistered AMI are terminated, specifying the ID of the image results in
   an error indicating that the AMI ID cannot be found.

  describe-images-request - `com.amazonaws.services.ec2.model.DescribeImagesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeImages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeImagesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeImagesRequest describe-images-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeImagesAsync describe-images-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeImagesRequest describe-images-request]
    (-> this (.describeImagesAsync describe-images-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeImagesAsync))))

(defn reboot-instances-async
  "Requests a reboot of the specified instances. This operation is asynchronous; it only queues a request to reboot
   the specified instances. The operation succeeds if the instances are valid and belong to you. Requests to reboot
   terminated instances are ignored.


   If an instance does not cleanly shut down within four minutes, Amazon EC2 performs a hard reboot.


   For more information about troubleshooting, see Getting Console Output and
   Rebooting Instances in the Amazon Elastic Compute Cloud User Guide.

  reboot-instances-request - `com.amazonaws.services.ec2.model.RebootInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RebootInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RebootInstancesRequest reboot-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootInstancesAsync reboot-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RebootInstancesRequest reboot-instances-request]
    (-> this (.rebootInstancesAsync reboot-instances-request))))

(defn modify-id-format-async
  "Modifies the ID format for the specified resource on a per-Region basis. You can specify that resources should
   receive longer IDs (17-character IDs) when they are created.


   This request can only be used to modify longer ID settings for resource types that are within the opt-in period.
   Resources currently in their opt-in period include: bundle | conversion-task |
   customer-gateway | dhcp-options | elastic-ip-allocation |
   elastic-ip-association | export-task | flow-log | image |
   import-task | internet-gateway | network-acl |
   network-acl-association | network-interface | network-interface-attachment
   | prefix-list | route-table | route-table-association |
   security-group | subnet | subnet-cidr-block-association | vpc
   | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection |
   vpn-connection | vpn-gateway.


   This setting applies to the IAM user who makes the request; it does not apply to the entire AWS account. By
   default, an IAM user defaults to the same settings as the root user. If you're using this action as the root
   user, then these settings apply to the entire account, unless an IAM user explicitly overrides these settings for
   themselves. For more information, see Resource IDs in the Amazon
   Elastic Compute Cloud User Guide.


   Resources created with longer IDs are visible to all IAM roles and users, regardless of these settings and
   provided that they have permission to use the relevant Describe command for the resource type.

  modify-id-format-request - `com.amazonaws.services.ec2.model.ModifyIdFormatRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyIdFormat operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyIdFormatResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyIdFormatRequest modify-id-format-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyIdFormatAsync modify-id-format-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyIdFormatRequest modify-id-format-request]
    (-> this (.modifyIdFormatAsync modify-id-format-request))))

(defn cancel-export-task-async
  "Cancels an active export task. The request removes all artifacts of the export, including any partially-created
   Amazon S3 objects. If the export task is complete or is in the process of transferring the final disk image, the
   command fails and returns an error.

  cancel-export-task-request - `com.amazonaws.services.ec2.model.CancelExportTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelExportTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CancelExportTaskResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CancelExportTaskRequest cancel-export-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelExportTaskAsync cancel-export-task-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CancelExportTaskRequest cancel-export-task-request]
    (-> this (.cancelExportTaskAsync cancel-export-task-request))))

(defn associate-address-async
  "Associates an Elastic IP address with an instance or a network interface. Before you can use an Elastic IP
   address, you must allocate it to your account.


   An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see Elastic IP Addresses
   in the Amazon Elastic Compute Cloud User Guide.


   [EC2-Classic, VPC in an EC2-VPC-only account] If the Elastic IP address is already associated with a different
   instance, it is disassociated from that instance and associated with the specified instance. If you associate an
   Elastic IP address with an instance that has an existing Elastic IP address, the existing address is
   disassociated from the instance, but remains allocated to your account.


   [VPC in an EC2-Classic account] If you don't specify a private IP address, the Elastic IP address is associated
   with the primary IP address. If the Elastic IP address is already associated with a different instance or a
   network interface, you get an error unless you allow reassociation. You cannot associate an Elastic IP address
   with an instance or network interface that has an existing Elastic IP address.



   This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error,
   and you may be charged for each time the Elastic IP address is remapped to the same instance. For more
   information, see the Elastic IP Addresses section of Amazon
   EC2 Pricing.

  associate-address-request - `com.amazonaws.services.ec2.model.AssociateAddressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateAddress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AssociateAddressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AssociateAddressRequest associate-address-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateAddressAsync associate-address-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AssociateAddressRequest associate-address-request]
    (-> this (.associateAddressAsync associate-address-request))))

(defn delete-volume-async
  "Deletes the specified EBS volume. The volume must be in the available state (not attached to an
   instance).


   The volume can remain in the deleting state for several minutes.


   For more information, see Deleting an Amazon EBS
   Volume in the Amazon Elastic Compute Cloud User Guide.

  delete-volume-request - Contains the parameters for DeleteVolume. - `com.amazonaws.services.ec2.model.DeleteVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteVolumeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteVolumeRequest delete-volume-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVolumeAsync delete-volume-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteVolumeRequest delete-volume-request]
    (-> this (.deleteVolumeAsync delete-volume-request))))

(defn purchase-reserved-instances-offering-async
  "Purchases a Reserved Instance for use with your account. With Reserved Instances, you pay a lower hourly rate
   compared to On-Demand instance pricing.


   Use DescribeReservedInstancesOfferings to get a list of Reserved Instance offerings that match your
   specifications. After you've purchased a Reserved Instance, you can check for your new Reserved Instance with
   DescribeReservedInstances.


   For more information, see Reserved
   Instances and Reserved
   Instance Marketplace in the Amazon Elastic Compute Cloud User Guide.

  purchase-reserved-instances-offering-request - Contains the parameters for PurchaseReservedInstancesOffering. - `com.amazonaws.services.ec2.model.PurchaseReservedInstancesOfferingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PurchaseReservedInstancesOffering operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.PurchaseReservedInstancesOfferingResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.PurchaseReservedInstancesOfferingRequest purchase-reserved-instances-offering-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.purchaseReservedInstancesOfferingAsync purchase-reserved-instances-offering-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.PurchaseReservedInstancesOfferingRequest purchase-reserved-instances-offering-request]
    (-> this (.purchaseReservedInstancesOfferingAsync purchase-reserved-instances-offering-request))))

(defn reset-ebs-default-kms-key-id-async
  "Resets the default customer master key (CMK) for EBS encryption for your account in this Region to the AWS
   managed CMK for EBS.


   After resetting the default CMK to the AWS managed CMK, you can continue to encrypt by a customer managed CMK by
   specifying it when you create the volume. For more information, see Amazon EBS Encryption in the
   Amazon Elastic Compute Cloud User Guide.

  reset-ebs-default-kms-key-id-request - `com.amazonaws.services.ec2.model.ResetEbsDefaultKmsKeyIdRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetEbsDefaultKmsKeyId operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ResetEbsDefaultKmsKeyIdResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ResetEbsDefaultKmsKeyIdRequest reset-ebs-default-kms-key-id-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetEbsDefaultKmsKeyIdAsync reset-ebs-default-kms-key-id-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ResetEbsDefaultKmsKeyIdRequest reset-ebs-default-kms-key-id-request]
    (-> this (.resetEbsDefaultKmsKeyIdAsync reset-ebs-default-kms-key-id-request))))

(defn modify-traffic-mirror-filter-rule-async
  "Modifies the specified Traffic Mirror rule.


   DestinationCidrBlock and SourceCidrBlock must both be an IPv4 range or an IPv6 range.

  modify-traffic-mirror-filter-rule-request - `com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyTrafficMirrorFilterRule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterRuleResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterRuleRequest modify-traffic-mirror-filter-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyTrafficMirrorFilterRuleAsync modify-traffic-mirror-filter-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterRuleRequest modify-traffic-mirror-filter-rule-request]
    (-> this (.modifyTrafficMirrorFilterRuleAsync modify-traffic-mirror-filter-rule-request))))

(defn create-transit-gateway-route-table-async
  "Creates a route table for the specified transit gateway.

  create-transit-gateway-route-table-request - `com.amazonaws.services.ec2.model.CreateTransitGatewayRouteTableRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTransitGatewayRouteTable operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateTransitGatewayRouteTableResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateTransitGatewayRouteTableRequest create-transit-gateway-route-table-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTransitGatewayRouteTableAsync create-transit-gateway-route-table-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateTransitGatewayRouteTableRequest create-transit-gateway-route-table-request]
    (-> this (.createTransitGatewayRouteTableAsync create-transit-gateway-route-table-request))))

(defn modify-instance-capacity-reservation-attributes-async
  "Modifies the Capacity Reservation settings for a stopped instance. Use this action to configure an instance to
   target a specific Capacity Reservation, run in any open Capacity Reservation with matching
   attributes, or run On-Demand Instance capacity.

  modify-instance-capacity-reservation-attributes-request - `com.amazonaws.services.ec2.model.ModifyInstanceCapacityReservationAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyInstanceCapacityReservationAttributes operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyInstanceCapacityReservationAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyInstanceCapacityReservationAttributesRequest modify-instance-capacity-reservation-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyInstanceCapacityReservationAttributesAsync modify-instance-capacity-reservation-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyInstanceCapacityReservationAttributesRequest modify-instance-capacity-reservation-attributes-request]
    (-> this (.modifyInstanceCapacityReservationAttributesAsync modify-instance-capacity-reservation-attributes-request))))

(defn export-transit-gateway-routes-async
  "Exports routes from the specified transit gateway route table to the specified S3 bucket. By default, all routes
   are exported. Alternatively, you can filter by CIDR range.

  export-transit-gateway-routes-request - `com.amazonaws.services.ec2.model.ExportTransitGatewayRoutesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExportTransitGatewayRoutes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ExportTransitGatewayRoutesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ExportTransitGatewayRoutesRequest export-transit-gateway-routes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.exportTransitGatewayRoutesAsync export-transit-gateway-routes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ExportTransitGatewayRoutesRequest export-transit-gateway-routes-request]
    (-> this (.exportTransitGatewayRoutesAsync export-transit-gateway-routes-request))))

(defn disassociate-subnet-cidr-block-async
  "Disassociates a CIDR block from a subnet. Currently, you can disassociate an IPv6 CIDR block only. You must
   detach or delete all gateways and resources that are associated with the CIDR block before you can disassociate
   it.

  disassociate-subnet-cidr-block-request - `com.amazonaws.services.ec2.model.DisassociateSubnetCidrBlockRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateSubnetCidrBlock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisassociateSubnetCidrBlockResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisassociateSubnetCidrBlockRequest disassociate-subnet-cidr-block-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateSubnetCidrBlockAsync disassociate-subnet-cidr-block-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisassociateSubnetCidrBlockRequest disassociate-subnet-cidr-block-request]
    (-> this (.disassociateSubnetCidrBlockAsync disassociate-subnet-cidr-block-request))))

(defn delete-fpga-image-async
  "Deletes the specified Amazon FPGA Image (AFI).

  delete-fpga-image-request - `com.amazonaws.services.ec2.model.DeleteFpgaImageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFpgaImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteFpgaImageResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteFpgaImageRequest delete-fpga-image-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFpgaImageAsync delete-fpga-image-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteFpgaImageRequest delete-fpga-image-request]
    (-> this (.deleteFpgaImageAsync delete-fpga-image-request))))

(defn delete-vpn-connection-route-async
  "Deletes the specified static route associated with a VPN connection between an existing virtual private gateway
   and a VPN customer gateway. The static route allows traffic to be routed from the virtual private gateway to the
   VPN customer gateway.

  delete-vpn-connection-route-request - Contains the parameters for DeleteVpnConnectionRoute. - `com.amazonaws.services.ec2.model.DeleteVpnConnectionRouteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVpnConnectionRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteVpnConnectionRouteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteVpnConnectionRouteRequest delete-vpn-connection-route-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVpnConnectionRouteAsync delete-vpn-connection-route-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteVpnConnectionRouteRequest delete-vpn-connection-route-request]
    (-> this (.deleteVpnConnectionRouteAsync delete-vpn-connection-route-request))))

(defn delete-traffic-mirror-target-async
  "Deletes the specified Traffic Mirror target.


   You cannot delete a Traffic Mirror target that is in use by a Traffic Mirror session.

  delete-traffic-mirror-target-request - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorTargetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTrafficMirrorTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteTrafficMirrorTargetResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorTargetRequest delete-traffic-mirror-target-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTrafficMirrorTargetAsync delete-traffic-mirror-target-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorTargetRequest delete-traffic-mirror-target-request]
    (-> this (.deleteTrafficMirrorTargetAsync delete-traffic-mirror-target-request))))

(defn delete-client-vpn-route-async
  "Deletes a route from a Client VPN endpoint. You can only delete routes that you manually added using the
   CreateClientVpnRoute action. You cannot delete routes that were automatically added when associating a
   subnet. To remove routes that have been automatically added, disassociate the target subnet from the Client VPN
   endpoint.

  delete-client-vpn-route-request - `com.amazonaws.services.ec2.model.DeleteClientVpnRouteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteClientVpnRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteClientVpnRouteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteClientVpnRouteRequest delete-client-vpn-route-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClientVpnRouteAsync delete-client-vpn-route-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteClientVpnRouteRequest delete-client-vpn-route-request]
    (-> this (.deleteClientVpnRouteAsync delete-client-vpn-route-request))))

(defn delete-launch-template-versions-async
  "Deletes one or more versions of a launch template. You cannot delete the default version of a launch template;
   you must first assign a different version as the default. If the default version is the only version for the
   launch template, you must delete the entire launch template using DeleteLaunchTemplate.

  delete-launch-template-versions-request - `com.amazonaws.services.ec2.model.DeleteLaunchTemplateVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLaunchTemplateVersions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteLaunchTemplateVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteLaunchTemplateVersionsRequest delete-launch-template-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLaunchTemplateVersionsAsync delete-launch-template-versions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteLaunchTemplateVersionsRequest delete-launch-template-versions-request]
    (-> this (.deleteLaunchTemplateVersionsAsync delete-launch-template-versions-request))))

(defn reset-fpga-image-attribute-async
  "Resets the specified attribute of the specified Amazon FPGA Image (AFI) to its default value. You can only reset
   the load permission attribute.

  reset-fpga-image-attribute-request - `com.amazonaws.services.ec2.model.ResetFpgaImageAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetFpgaImageAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ResetFpgaImageAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ResetFpgaImageAttributeRequest reset-fpga-image-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetFpgaImageAttributeAsync reset-fpga-image-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ResetFpgaImageAttributeRequest reset-fpga-image-attribute-request]
    (-> this (.resetFpgaImageAttributeAsync reset-fpga-image-attribute-request))))

(defn describe-spot-fleet-requests-async
  "Describes your Spot Fleet requests.


   Spot Fleet requests are deleted 48 hours after they are canceled and their instances are terminated.

  describe-spot-fleet-requests-request - Contains the parameters for DescribeSpotFleetRequests. - `com.amazonaws.services.ec2.model.DescribeSpotFleetRequestsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSpotFleetRequests operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeSpotFleetRequestsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeSpotFleetRequestsRequest describe-spot-fleet-requests-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSpotFleetRequestsAsync describe-spot-fleet-requests-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeSpotFleetRequestsRequest describe-spot-fleet-requests-request]
    (-> this (.describeSpotFleetRequestsAsync describe-spot-fleet-requests-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeSpotFleetRequestsAsync))))

(defn describe-vpc-endpoint-service-permissions-async
  "Describes the principals (service consumers) that are permitted to discover your VPC endpoint service.

  describe-vpc-endpoint-service-permissions-request - `com.amazonaws.services.ec2.model.DescribeVpcEndpointServicePermissionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcEndpointServicePermissions operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpcEndpointServicePermissionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointServicePermissionsRequest describe-vpc-endpoint-service-permissions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcEndpointServicePermissionsAsync describe-vpc-endpoint-service-permissions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointServicePermissionsRequest describe-vpc-endpoint-service-permissions-request]
    (-> this (.describeVpcEndpointServicePermissionsAsync describe-vpc-endpoint-service-permissions-request))))

(defn import-snapshot-async
  "Imports a disk into an EBS snapshot.

  import-snapshot-request - `com.amazonaws.services.ec2.model.ImportSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ImportSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ImportSnapshotRequest import-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importSnapshotAsync import-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ImportSnapshotRequest import-snapshot-request]
    (-> this (.importSnapshotAsync import-snapshot-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.importSnapshotAsync))))

(defn create-fpga-image-async
  "Creates an Amazon FPGA Image (AFI) from the specified design checkpoint (DCP).


   The create operation is asynchronous. To verify that the AFI is ready for use, check the output logs.


   An AFI contains the FPGA bitstream that is ready to download to an FPGA. You can securely deploy an AFI on
   multiple FPGA-accelerated instances. For more information, see the AWS
   FPGA Hardware Development Kit.

  create-fpga-image-request - `com.amazonaws.services.ec2.model.CreateFpgaImageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFpgaImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateFpgaImageResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateFpgaImageRequest create-fpga-image-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFpgaImageAsync create-fpga-image-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateFpgaImageRequest create-fpga-image-request]
    (-> this (.createFpgaImageAsync create-fpga-image-request))))

(defn describe-transit-gateway-attachments-async
  "Describes one or more attachments between resources and transit gateways. By default, all attachments are
   described. Alternatively, you can filter the results by attachment ID, attachment state, resource ID, or resource
   owner.

  describe-transit-gateway-attachments-request - `com.amazonaws.services.ec2.model.DescribeTransitGatewayAttachmentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTransitGatewayAttachments operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeTransitGatewayAttachmentsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeTransitGatewayAttachmentsRequest describe-transit-gateway-attachments-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTransitGatewayAttachmentsAsync describe-transit-gateway-attachments-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeTransitGatewayAttachmentsRequest describe-transit-gateway-attachments-request]
    (-> this (.describeTransitGatewayAttachmentsAsync describe-transit-gateway-attachments-request))))

(defn delete-placement-group-async
  "Deletes the specified placement group. You must terminate all instances in the placement group before you can
   delete the placement group. For more information, see Placement Groups in the
   Amazon Elastic Compute Cloud User Guide.

  delete-placement-group-request - `com.amazonaws.services.ec2.model.DeletePlacementGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePlacementGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeletePlacementGroupResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeletePlacementGroupRequest delete-placement-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePlacementGroupAsync delete-placement-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeletePlacementGroupRequest delete-placement-group-request]
    (-> this (.deletePlacementGroupAsync delete-placement-group-request))))

(defn describe-spot-instance-requests-async
  "Describes the specified Spot Instance requests.


   You can use DescribeSpotInstanceRequests to find a running Spot Instance by examining the response.
   If the status of the Spot Instance is fulfilled, the instance ID appears in the response and
   contains the identifier of the instance. Alternatively, you can use DescribeInstances with a filter to
   look for instances where the instance lifecycle is spot.


   We recommend that you set MaxResults to a value between 5 and 1000 to limit the number of results
   returned. This paginates the output, which makes the list more manageable and returns the results faster. If the
   list of results exceeds your MaxResults value, then that number of results is returned along with a
   NextToken value that can be passed to a subsequent DescribeSpotInstanceRequests request
   to retrieve the remaining results.


   Spot Instance requests are deleted four hours after they are canceled and their instances are terminated.

  describe-spot-instance-requests-request - Contains the parameters for DescribeSpotInstanceRequests. - `com.amazonaws.services.ec2.model.DescribeSpotInstanceRequestsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSpotInstanceRequests operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeSpotInstanceRequestsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeSpotInstanceRequestsRequest describe-spot-instance-requests-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSpotInstanceRequestsAsync describe-spot-instance-requests-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeSpotInstanceRequestsRequest describe-spot-instance-requests-request]
    (-> this (.describeSpotInstanceRequestsAsync describe-spot-instance-requests-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeSpotInstanceRequestsAsync))))

(defn create-vpc-endpoint-service-configuration-async
  "Creates a VPC endpoint service configuration to which service consumers (AWS accounts, IAM users, and IAM roles)
   can connect. Service consumers can create an interface VPC endpoint to connect to your service.


   To create an endpoint service configuration, you must first create a Network Load Balancer for your service. For
   more information, see VPC
   Endpoint Services in the Amazon Virtual Private Cloud User Guide.

  create-vpc-endpoint-service-configuration-request - `com.amazonaws.services.ec2.model.CreateVpcEndpointServiceConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVpcEndpointServiceConfiguration operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateVpcEndpointServiceConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateVpcEndpointServiceConfigurationRequest create-vpc-endpoint-service-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVpcEndpointServiceConfigurationAsync create-vpc-endpoint-service-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateVpcEndpointServiceConfigurationRequest create-vpc-endpoint-service-configuration-request]
    (-> this (.createVpcEndpointServiceConfigurationAsync create-vpc-endpoint-service-configuration-request))))

(defn detach-vpn-gateway-async
  "Detaches a virtual private gateway from a VPC. You do this if you're planning to turn off the VPC and not use it
   anymore. You can confirm a virtual private gateway has been completely detached from a VPC by describing the
   virtual private gateway (any attachments to the virtual private gateway are also described).


   You must wait for the attachment's state to switch to detached before you can delete the VPC or
   attach a different VPC to the virtual private gateway.

  detach-vpn-gateway-request - Contains the parameters for DetachVpnGateway. - `com.amazonaws.services.ec2.model.DetachVpnGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachVpnGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DetachVpnGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DetachVpnGatewayRequest detach-vpn-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachVpnGatewayAsync detach-vpn-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DetachVpnGatewayRequest detach-vpn-gateway-request]
    (-> this (.detachVpnGatewayAsync detach-vpn-gateway-request))))

(defn create-spot-datafeed-subscription-async
  "Creates a data feed for Spot Instances, enabling you to view Spot Instance usage logs. You can create one data
   feed per AWS account. For more information, see Spot Instance Data Feed in
   the Amazon EC2 User Guide for Linux Instances.

  create-spot-datafeed-subscription-request - Contains the parameters for CreateSpotDatafeedSubscription. - `com.amazonaws.services.ec2.model.CreateSpotDatafeedSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSpotDatafeedSubscription operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateSpotDatafeedSubscriptionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateSpotDatafeedSubscriptionRequest create-spot-datafeed-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSpotDatafeedSubscriptionAsync create-spot-datafeed-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateSpotDatafeedSubscriptionRequest create-spot-datafeed-subscription-request]
    (-> this (.createSpotDatafeedSubscriptionAsync create-spot-datafeed-subscription-request))))

(defn create-snapshot-async
  "Creates a snapshot of an EBS volume and stores it in Amazon S3. You can use snapshots for backups, to make copies
   of EBS volumes, and to save data before shutting down an instance.


   When a snapshot is created, any AWS Marketplace product codes that are associated with the source volume are
   propagated to the snapshot.


   You can take a snapshot of an attached volume that is in use. However, snapshots only capture data that has been
   written to your EBS volume at the time the snapshot command is issued; this may exclude any data that has been
   cached by any applications or the operating system. If you can pause any file systems on the volume long enough
   to take a snapshot, your snapshot should be complete. However, if you cannot pause all file writes to the volume,
   you should unmount the volume from within the instance, issue the snapshot command, and then remount the volume
   to ensure a consistent and complete snapshot. You may remount and use your volume while the snapshot status is
   pending.


   To create a snapshot for EBS volumes that serve as root devices, you should stop the instance before taking the
   snapshot.


   Snapshots that are taken from encrypted volumes are automatically encrypted. Volumes that are created from
   encrypted snapshots are also automatically encrypted. Your encrypted volumes and any associated snapshots always
   remain protected.


   You can tag your snapshots during creation. For more information, see Tagging Your Amazon EC2 Resources
   in the Amazon Elastic Compute Cloud User Guide.


   For more information, see Amazon
   Elastic Block Store and Amazon EBS Encryption in the
   Amazon Elastic Compute Cloud User Guide.

  create-snapshot-request - Contains the parameters for CreateSnapshot. - `com.amazonaws.services.ec2.model.CreateSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateSnapshotRequest create-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSnapshotAsync create-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateSnapshotRequest create-snapshot-request]
    (-> this (.createSnapshotAsync create-snapshot-request))))

(defn revoke-security-group-egress-async
  "[VPC only] Removes the specified egress rules from a security group for EC2-VPC. This action doesn't apply to
   security groups for use in EC2-Classic. To remove a rule, the values that you specify (for example, ports) must
   match the existing rule's values exactly.


   Each rule consists of the protocol and the IPv4 or IPv6 CIDR range or source security group. For the TCP and UDP
   protocols, you must also specify the destination port or range of ports. For the ICMP protocol, you must also
   specify the ICMP type and code. If the security group rule has a description, you do not have to specify the
   description to revoke the rule.


   Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay
   might occur.

  revoke-security-group-egress-request - `com.amazonaws.services.ec2.model.RevokeSecurityGroupEgressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeSecurityGroupEgress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RevokeSecurityGroupEgressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RevokeSecurityGroupEgressRequest revoke-security-group-egress-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeSecurityGroupEgressAsync revoke-security-group-egress-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RevokeSecurityGroupEgressRequest revoke-security-group-egress-request]
    (-> this (.revokeSecurityGroupEgressAsync revoke-security-group-egress-request))))

(defn delete-customer-gateway-async
  "Deletes the specified customer gateway. You must delete the VPN connection before you can delete the customer
   gateway.

  delete-customer-gateway-request - Contains the parameters for DeleteCustomerGateway. - `com.amazonaws.services.ec2.model.DeleteCustomerGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCustomerGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteCustomerGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteCustomerGatewayRequest delete-customer-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCustomerGatewayAsync delete-customer-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteCustomerGatewayRequest delete-customer-gateway-request]
    (-> this (.deleteCustomerGatewayAsync delete-customer-gateway-request))))

(defn delete-subnet-async
  "Deletes the specified subnet. You must terminate all running instances in the subnet before you can delete the
   subnet.

  delete-subnet-request - `com.amazonaws.services.ec2.model.DeleteSubnetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSubnet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteSubnetResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteSubnetRequest delete-subnet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSubnetAsync delete-subnet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteSubnetRequest delete-subnet-request]
    (-> this (.deleteSubnetAsync delete-subnet-request))))

(defn delete-network-acl-entry-async
  "Deletes the specified ingress or egress entry (rule) from the specified network ACL.

  delete-network-acl-entry-request - `com.amazonaws.services.ec2.model.DeleteNetworkAclEntryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNetworkAclEntry operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteNetworkAclEntryResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteNetworkAclEntryRequest delete-network-acl-entry-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNetworkAclEntryAsync delete-network-acl-entry-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteNetworkAclEntryRequest delete-network-acl-entry-request]
    (-> this (.deleteNetworkAclEntryAsync delete-network-acl-entry-request))))

(defn describe-volumes-async
  "Describes the specified EBS volumes or all of your EBS volumes.


   If you are describing a long list of volumes, you can paginate the output to make the list more manageable. The
   MaxResults parameter sets the maximum number of results returned in a single page. If the list of
   results exceeds your MaxResults value, then that number of results is returned along with a
   NextToken value that can be passed to a subsequent DescribeVolumes request to retrieve
   the remaining results.


   For more information about EBS volumes, see Amazon EBS Volumes in the
   Amazon Elastic Compute Cloud User Guide.

  describe-volumes-request - `com.amazonaws.services.ec2.model.DescribeVolumesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVolumes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVolumesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVolumesRequest describe-volumes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVolumesAsync describe-volumes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVolumesRequest describe-volumes-request]
    (-> this (.describeVolumesAsync describe-volumes-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeVolumesAsync))))

(defn release-hosts-async
  "When you no longer want to use an On-Demand Dedicated Host it can be released. On-Demand billing is stopped and
   the host goes into released state. The host ID of Dedicated Hosts that have been released can no
   longer be specified in another request, for example, to modify the host. You must stop or terminate all instances
   on a host before it can be released.


   When Dedicated Hosts are released, it may take some time for them to stop counting toward your limit and you may
   receive capacity errors when trying to allocate new Dedicated Hosts. Wait a few minutes and then try again.


   Released hosts still appear in a DescribeHosts response.

  release-hosts-request - `com.amazonaws.services.ec2.model.ReleaseHostsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReleaseHosts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ReleaseHostsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ReleaseHostsRequest release-hosts-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.releaseHostsAsync release-hosts-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ReleaseHostsRequest release-hosts-request]
    (-> this (.releaseHostsAsync release-hosts-request))))

(defn modify-volume-async
  "You can modify several parameters of an existing EBS volume, including volume size, volume type, and IOPS
   capacity. If your EBS volume is attached to a current-generation EC2 instance type, you may be able to apply
   these changes without stopping the instance or detaching the volume from it. For more information about modifying
   an EBS volume running Linux, see Modifying the Size, IOPS, or
   Type of an EBS Volume on Linux. For more information about modifying an EBS volume running Windows, see Modifying the Size, IOPS, or
   Type of an EBS Volume on Windows.


   When you complete a resize operation on your volume, you need to extend the volume's file-system size to take
   advantage of the new storage capacity. For information about extending a Linux file system, see Extending a Linux File System. For information about extending a Windows file system, see Extending a Windows File System.


   You can use CloudWatch Events to check the status of a modification to an EBS volume. For information about
   CloudWatch Events, see the Amazon
   CloudWatch Events User Guide. You can also track the status of a modification using
   DescribeVolumesModifications. For information about tracking status changes using either method, see Monitoring
   Volume Modifications.


   With previous-generation instance types, resizing an EBS volume may require detaching and reattaching the volume
   or stopping and restarting the instance. For more information, see Modifying the Size, IOPS, or
   Type of an EBS Volume on Linux and Modifying the Size, IOPS, or
   Type of an EBS Volume on Windows.


   If you reach the maximum volume modification rate per volume limit, you will need to wait at least six hours
   before applying further modifications to the affected EBS volume.

  modify-volume-request - `com.amazonaws.services.ec2.model.ModifyVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyVolumeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyVolumeRequest modify-volume-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyVolumeAsync modify-volume-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyVolumeRequest modify-volume-request]
    (-> this (.modifyVolumeAsync modify-volume-request))))

(defn confirm-product-instance-async
  "Determines whether a product code is associated with an instance. This action can only be used by the owner of
   the product code. It is useful when a product code owner must verify whether another user's instance is eligible
   for support.

  confirm-product-instance-request - `com.amazonaws.services.ec2.model.ConfirmProductInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ConfirmProductInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ConfirmProductInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ConfirmProductInstanceRequest confirm-product-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.confirmProductInstanceAsync confirm-product-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ConfirmProductInstanceRequest confirm-product-instance-request]
    (-> this (.confirmProductInstanceAsync confirm-product-instance-request))))

(defn terminate-instances-async
  "Shuts down the specified instances. This operation is idempotent; if you terminate an instance more than once,
   each call succeeds.


   If you specify multiple instances and the request fails (for example, because of a single incorrect instance ID),
   none of the instances are terminated.


   Terminated instances remain visible after termination (for approximately one hour).


   By default, Amazon EC2 deletes all EBS volumes that were attached when the instance launched. Volumes attached
   after instance launch continue running.


   You can stop, start, and terminate EBS-backed instances. You can only terminate instance store-backed instances.
   What happens to an instance differs if you stop it or terminate it. For example, when you stop an instance, the
   root device and any other devices attached to the instance persist. When you terminate an instance, any attached
   EBS volumes with the DeleteOnTermination block device mapping parameter set to true are
   automatically deleted. For more information about the differences between stopping and terminating instances, see
   Instance Lifecycle
   in the Amazon Elastic Compute Cloud User Guide.


   For more information about troubleshooting, see Troubleshooting Terminating Your Instance in the Amazon Elastic Compute Cloud User Guide.

  terminate-instances-request - `com.amazonaws.services.ec2.model.TerminateInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TerminateInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.TerminateInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.TerminateInstancesRequest terminate-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.terminateInstancesAsync terminate-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.TerminateInstancesRequest terminate-instances-request]
    (-> this (.terminateInstancesAsync terminate-instances-request))))

(defn modify-spot-fleet-request-async
  "Modifies the specified Spot Fleet request.


   You can only modify a Spot Fleet request of type maintain.


   While the Spot Fleet request is being modified, it is in the modifying state.


   To scale up your Spot Fleet, increase its target capacity. The Spot Fleet launches the additional Spot Instances
   according to the allocation strategy for the Spot Fleet request. If the allocation strategy is
   lowestPrice, the Spot Fleet launches instances using the Spot pool with the lowest price. If the
   allocation strategy is diversified, the Spot Fleet distributes the instances across the Spot pools.


   To scale down your Spot Fleet, decrease its target capacity. First, the Spot Fleet cancels any open requests that
   exceed the new target capacity. You can request that the Spot Fleet terminate Spot Instances until the size of
   the fleet no longer exceeds the new target capacity. If the allocation strategy is lowestPrice, the
   Spot Fleet terminates the instances with the highest price per unit. If the allocation strategy is
   diversified, the Spot Fleet terminates instances across the Spot pools. Alternatively, you can
   request that the Spot Fleet keep the fleet at its current size, but not replace any Spot Instances that are
   interrupted or that you terminate manually.


   If you are finished with your Spot Fleet for now, but will use it again later, you can set the target capacity to
   0.

  modify-spot-fleet-request-request - Contains the parameters for ModifySpotFleetRequest. - `com.amazonaws.services.ec2.model.ModifySpotFleetRequestRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifySpotFleetRequest operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifySpotFleetRequestResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifySpotFleetRequestRequest modify-spot-fleet-request-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifySpotFleetRequestAsync modify-spot-fleet-request-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifySpotFleetRequestRequest modify-spot-fleet-request-request]
    (-> this (.modifySpotFleetRequestAsync modify-spot-fleet-request-request))))

(defn get-ebs-default-kms-key-id-async
  "Describes the default customer master key (CMK) for EBS encryption by default for your account in this Region.
   You can change the default CMK for encryption by default using ModifyEbsDefaultKmsKeyId or
   ResetEbsDefaultKmsKeyId.


   For more information, see Amazon
   EBS Encryption in the Amazon Elastic Compute Cloud User Guide.

  get-ebs-default-kms-key-id-request - `com.amazonaws.services.ec2.model.GetEbsDefaultKmsKeyIdRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEbsDefaultKmsKeyId operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetEbsDefaultKmsKeyIdResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetEbsDefaultKmsKeyIdRequest get-ebs-default-kms-key-id-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEbsDefaultKmsKeyIdAsync get-ebs-default-kms-key-id-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetEbsDefaultKmsKeyIdRequest get-ebs-default-kms-key-id-request]
    (-> this (.getEbsDefaultKmsKeyIdAsync get-ebs-default-kms-key-id-request))))

(defn create-traffic-mirror-filter-rule-async
  "Creates a Traffic Mirror rule.


   A Traffic Mirror rule defines the Traffic Mirror source traffic to mirror.


   You need the Traffic Mirror filter ID when you create the rule.

  create-traffic-mirror-filter-rule-request - `com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTrafficMirrorFilterRule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRuleResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRuleRequest create-traffic-mirror-filter-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTrafficMirrorFilterRuleAsync create-traffic-mirror-filter-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRuleRequest create-traffic-mirror-filter-rule-request]
    (-> this (.createTrafficMirrorFilterRuleAsync create-traffic-mirror-filter-rule-request))))

(defn reset-image-attribute-async
  "Resets an attribute of an AMI to its default value.



   The productCodes attribute can't be reset.

  reset-image-attribute-request - Contains the parameters for ResetImageAttribute. - `com.amazonaws.services.ec2.model.ResetImageAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetImageAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ResetImageAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ResetImageAttributeRequest reset-image-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetImageAttributeAsync reset-image-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ResetImageAttributeRequest reset-image-attribute-request]
    (-> this (.resetImageAttributeAsync reset-image-attribute-request))))

(defn delete-launch-template-async
  "Deletes a launch template. Deleting a launch template deletes all of its versions.

  delete-launch-template-request - `com.amazonaws.services.ec2.model.DeleteLaunchTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLaunchTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteLaunchTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteLaunchTemplateRequest delete-launch-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLaunchTemplateAsync delete-launch-template-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteLaunchTemplateRequest delete-launch-template-request]
    (-> this (.deleteLaunchTemplateAsync delete-launch-template-request))))

(defn describe-dhcp-options-async
  "Describes one or more of your DHCP options sets.


   For more information, see DHCP
   Options Sets in the Amazon Virtual Private Cloud User Guide.

  describe-dhcp-options-request - `com.amazonaws.services.ec2.model.DescribeDhcpOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDhcpOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeDhcpOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeDhcpOptionsRequest describe-dhcp-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDhcpOptionsAsync describe-dhcp-options-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeDhcpOptionsRequest describe-dhcp-options-request]
    (-> this (.describeDhcpOptionsAsync describe-dhcp-options-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeDhcpOptionsAsync))))

(defn restore-address-to-classic-async
  "Restores an Elastic IP address that was previously moved to the EC2-VPC platform back to the EC2-Classic
   platform. You cannot move an Elastic IP address that was originally allocated for use in EC2-VPC. The Elastic IP
   address must not be associated with an instance or network interface.

  restore-address-to-classic-request - `com.amazonaws.services.ec2.model.RestoreAddressToClassicRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreAddressToClassic operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RestoreAddressToClassicResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RestoreAddressToClassicRequest restore-address-to-classic-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreAddressToClassicAsync restore-address-to-classic-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RestoreAddressToClassicRequest restore-address-to-classic-request]
    (-> this (.restoreAddressToClassicAsync restore-address-to-classic-request))))

(defn delete-vpc-async
  "Deletes the specified VPC. You must detach or delete all gateways and resources that are associated with the VPC
   before you can delete it. For example, you must terminate all instances running in the VPC, delete all security
   groups associated with the VPC (except the default one), delete all route tables associated with the VPC (except
   the default one), and so on.

  delete-vpc-request - `com.amazonaws.services.ec2.model.DeleteVpcRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVpc operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteVpcResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteVpcRequest delete-vpc-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVpcAsync delete-vpc-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteVpcRequest delete-vpc-request]
    (-> this (.deleteVpcAsync delete-vpc-request))))

(defn modify-subnet-attribute-async
  "Modifies a subnet attribute. You can only modify one attribute at a time.

  modify-subnet-attribute-request - `com.amazonaws.services.ec2.model.ModifySubnetAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifySubnetAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifySubnetAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifySubnetAttributeRequest modify-subnet-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifySubnetAttributeAsync modify-subnet-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifySubnetAttributeRequest modify-subnet-attribute-request]
    (-> this (.modifySubnetAttributeAsync modify-subnet-attribute-request))))

(defn run-scheduled-instances-async
  "Launches the specified Scheduled Instances.


   Before you can launch a Scheduled Instance, you must purchase it and obtain an identifier using
   PurchaseScheduledInstances.


   You must launch a Scheduled Instance during its scheduled time period. You can't stop or reboot a Scheduled
   Instance, but you can terminate it as needed. If you terminate a Scheduled Instance before the current scheduled
   time period ends, you can launch it again after a few minutes. For more information, see Scheduled Instances
   in the Amazon Elastic Compute Cloud User Guide.

  run-scheduled-instances-request - Contains the parameters for RunScheduledInstances. - `com.amazonaws.services.ec2.model.RunScheduledInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RunScheduledInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RunScheduledInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RunScheduledInstancesRequest run-scheduled-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.runScheduledInstancesAsync run-scheduled-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RunScheduledInstancesRequest run-scheduled-instances-request]
    (-> this (.runScheduledInstancesAsync run-scheduled-instances-request))))

(defn update-security-group-rule-descriptions-ingress-async
  "Updates the description of an ingress (inbound) security group rule. You can replace an existing description, or
   add a description to a rule that did not have one previously.


   You specify the description as part of the IP permissions structure. You can remove a description for a security
   group rule by omitting the description parameter in the request.

  update-security-group-rule-descriptions-ingress-request - `com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsIngressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSecurityGroupRuleDescriptionsIngress operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsIngressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsIngressRequest update-security-group-rule-descriptions-ingress-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSecurityGroupRuleDescriptionsIngressAsync update-security-group-rule-descriptions-ingress-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsIngressRequest update-security-group-rule-descriptions-ingress-request]
    (-> this (.updateSecurityGroupRuleDescriptionsIngressAsync update-security-group-rule-descriptions-ingress-request))))

(defn bundle-instance-async
  "Bundles an Amazon instance store-backed Windows instance.


   During bundling, only the root device volume (C:\\) is bundled. Data on other instance store volumes is not
   preserved.



   This action is not applicable for Linux/Unix instances or Windows instances that are backed by Amazon EBS.

  bundle-instance-request - Contains the parameters for BundleInstance. - `com.amazonaws.services.ec2.model.BundleInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BundleInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.BundleInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.BundleInstanceRequest bundle-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.bundleInstanceAsync bundle-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.BundleInstanceRequest bundle-instance-request]
    (-> this (.bundleInstanceAsync bundle-instance-request))))

(defn modify-ebs-default-kms-key-id-async
  "Changes the default customer master key (CMK) for EBS encryption by default for your account in this Region.


   AWS creates a unique AWS managed CMK in each Region for use with encryption by default. If you change the default
   CMK to a customer managed CMK, it is used instead of the AWS managed CMK. To reset the default CMK to the AWS
   managed CMK for EBS, use ResetEbsDefaultKmsKeyId.


   If you delete or disable the customer managed CMK that you specified for use with encryption by default, your
   instances will fail to launch.


   For more information, see Amazon
   EBS Encryption in the Amazon Elastic Compute Cloud User Guide.

  modify-ebs-default-kms-key-id-request - `com.amazonaws.services.ec2.model.ModifyEbsDefaultKmsKeyIdRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyEbsDefaultKmsKeyId operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyEbsDefaultKmsKeyIdResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyEbsDefaultKmsKeyIdRequest modify-ebs-default-kms-key-id-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyEbsDefaultKmsKeyIdAsync modify-ebs-default-kms-key-id-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyEbsDefaultKmsKeyIdRequest modify-ebs-default-kms-key-id-request]
    (-> this (.modifyEbsDefaultKmsKeyIdAsync modify-ebs-default-kms-key-id-request))))

(defn delete-network-interface-async
  "Deletes the specified network interface. You must detach the network interface before you can delete it.

  delete-network-interface-request - Contains the parameters for DeleteNetworkInterface. - `com.amazonaws.services.ec2.model.DeleteNetworkInterfaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNetworkInterface operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteNetworkInterfaceResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteNetworkInterfaceRequest delete-network-interface-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNetworkInterfaceAsync delete-network-interface-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteNetworkInterfaceRequest delete-network-interface-request]
    (-> this (.deleteNetworkInterfaceAsync delete-network-interface-request))))

(defn accept-transit-gateway-vpc-attachment-async
  "Accepts a request to attach a VPC to a transit gateway.


   The VPC attachment must be in the pendingAcceptance state. Use
   DescribeTransitGatewayVpcAttachments to view your pending VPC attachment requests. Use
   RejectTransitGatewayVpcAttachment to reject a VPC attachment request.

  accept-transit-gateway-vpc-attachment-request - `com.amazonaws.services.ec2.model.AcceptTransitGatewayVpcAttachmentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptTransitGatewayVpcAttachment operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AcceptTransitGatewayVpcAttachmentResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AcceptTransitGatewayVpcAttachmentRequest accept-transit-gateway-vpc-attachment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptTransitGatewayVpcAttachmentAsync accept-transit-gateway-vpc-attachment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AcceptTransitGatewayVpcAttachmentRequest accept-transit-gateway-vpc-attachment-request]
    (-> this (.acceptTransitGatewayVpcAttachmentAsync accept-transit-gateway-vpc-attachment-request))))

(defn delete-vpn-connection-async
  "Deletes the specified VPN connection.


   If you're deleting the VPC and its associated components, we recommend that you detach the virtual private
   gateway from the VPC and delete the VPC before deleting the VPN connection. If you believe that the tunnel
   credentials for your VPN connection have been compromised, you can delete the VPN connection and create a new one
   that has new keys, without needing to delete the VPC or virtual private gateway. If you create a new VPN
   connection, you must reconfigure the customer gateway using the new configuration information returned with the
   new VPN connection ID.

  delete-vpn-connection-request - Contains the parameters for DeleteVpnConnection. - `com.amazonaws.services.ec2.model.DeleteVpnConnectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVpnConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteVpnConnectionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteVpnConnectionRequest delete-vpn-connection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVpnConnectionAsync delete-vpn-connection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteVpnConnectionRequest delete-vpn-connection-request]
    (-> this (.deleteVpnConnectionAsync delete-vpn-connection-request))))

(defn cancel-conversion-task-async
  "Cancels an active conversion task. The task can be the import of an instance or volume. The action removes all
   artifacts of the conversion, including a partially uploaded volume or instance. If the conversion is complete or
   is in the process of transferring the final disk image, the command fails and returns an exception.


   For more information, see Importing a
   Virtual Machine Using the Amazon EC2 CLI.

  cancel-conversion-task-request - `com.amazonaws.services.ec2.model.CancelConversionTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelConversionTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CancelConversionTaskResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CancelConversionTaskRequest cancel-conversion-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelConversionTaskAsync cancel-conversion-task-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CancelConversionTaskRequest cancel-conversion-task-request]
    (-> this (.cancelConversionTaskAsync cancel-conversion-task-request))))

(defn describe-reserved-instances-listings-async
  "Describes your account's Reserved Instance listings in the Reserved Instance Marketplace.


   The Reserved Instance Marketplace matches sellers who want to resell Reserved Instance capacity that they no
   longer need with buyers who want to purchase additional capacity. Reserved Instances bought and sold through the
   Reserved Instance Marketplace work like any other Reserved Instances.


   As a seller, you choose to list some or all of your Reserved Instances, and you specify the upfront price to
   receive for them. Your Reserved Instances are then listed in the Reserved Instance Marketplace and are available
   for purchase.


   As a buyer, you specify the configuration of the Reserved Instance to purchase, and the Marketplace matches what
   you're searching for with what's available. The Marketplace first sells the lowest priced Reserved Instances to
   you, and continues to sell available Reserved Instance listings to you until your demand is met. You are charged
   based on the total price of all of the listings that you purchase.


   For more information, see Reserved Instance
   Marketplace in the Amazon Elastic Compute Cloud User Guide.

  describe-reserved-instances-listings-request - Contains the parameters for DescribeReservedInstancesListings. - `com.amazonaws.services.ec2.model.DescribeReservedInstancesListingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedInstancesListings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeReservedInstancesListingsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesListingsRequest describe-reserved-instances-listings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedInstancesListingsAsync describe-reserved-instances-listings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesListingsRequest describe-reserved-instances-listings-request]
    (-> this (.describeReservedInstancesListingsAsync describe-reserved-instances-listings-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeReservedInstancesListingsAsync))))

(defn create-network-acl-async
  "Creates a network ACL in a VPC. Network ACLs provide an optional layer of security (in addition to security
   groups) for the instances in your VPC.


   For more information, see Network
   ACLs in the Amazon Virtual Private Cloud User Guide.

  create-network-acl-request - `com.amazonaws.services.ec2.model.CreateNetworkAclRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNetworkAcl operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateNetworkAclResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateNetworkAclRequest create-network-acl-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNetworkAclAsync create-network-acl-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateNetworkAclRequest create-network-acl-request]
    (-> this (.createNetworkAclAsync create-network-acl-request))))

(defn describe-principal-id-format-async
  "Describes the ID format settings for the root user and all IAM roles and IAM users that have explicitly specified
   a longer ID (17-character ID) preference.


   By default, all IAM roles and IAM users default to the same ID settings as the root user, unless they explicitly
   override the settings. This request is useful for identifying those IAM users and IAM roles that have overridden
   the default ID settings.


   The following resource types support longer IDs: bundle | conversion-task |
   customer-gateway | dhcp-options | elastic-ip-allocation |
   elastic-ip-association | export-task | flow-log | image |
   import-task | instance | internet-gateway | network-acl |
   network-acl-association | network-interface | network-interface-attachment
   | prefix-list | reservation | route-table |
   route-table-association | security-group | snapshot | subnet
   | subnet-cidr-block-association | volume | vpc |
   vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection |
   vpn-connection | vpn-gateway.

  describe-principal-id-format-request - `com.amazonaws.services.ec2.model.DescribePrincipalIdFormatRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePrincipalIdFormat operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribePrincipalIdFormatResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribePrincipalIdFormatRequest describe-principal-id-format-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePrincipalIdFormatAsync describe-principal-id-format-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribePrincipalIdFormatRequest describe-principal-id-format-request]
    (-> this (.describePrincipalIdFormatAsync describe-principal-id-format-request))))

(defn terminate-client-vpn-connections-async
  "Terminates active Client VPN endpoint connections. This action can be used to terminate a specific client
   connection, or up to five connections established by a specific user.

  terminate-client-vpn-connections-request - `com.amazonaws.services.ec2.model.TerminateClientVpnConnectionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TerminateClientVpnConnections operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.TerminateClientVpnConnectionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.TerminateClientVpnConnectionsRequest terminate-client-vpn-connections-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.terminateClientVpnConnectionsAsync terminate-client-vpn-connections-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.TerminateClientVpnConnectionsRequest terminate-client-vpn-connections-request]
    (-> this (.terminateClientVpnConnectionsAsync terminate-client-vpn-connections-request))))

(defn allocate-address-async
  "Allocates an Elastic IP address to your AWS account. After you allocate the Elastic IP address you can associate
   it with an instance or network interface. After you release an Elastic IP address, it is released to the IP
   address pool and can be allocated to a different AWS account.


   You can allocate an Elastic IP address from an address pool owned by AWS or from an address pool created from a
   public IPv4 address range that you have brought to AWS for use with your AWS resources using bring your own IP
   addresses (BYOIP). For more information, see Bring Your Own IP Addresses (BYOIP)
   in the Amazon Elastic Compute Cloud User Guide.


   [EC2-VPC] If you release an Elastic IP address, you might be able to recover it. You cannot recover an Elastic IP
   address that you released after it is allocated to another AWS account. You cannot recover an Elastic IP address
   for EC2-Classic. To attempt to recover an Elastic IP address that you released, specify it in this operation.


   An Elastic IP address is for use either in the EC2-Classic platform or in a VPC. By default, you can allocate 5
   Elastic IP addresses for EC2-Classic per Region and 5 Elastic IP addresses for EC2-VPC per Region.


   For more information, see Elastic IP Addresses
   in the Amazon Elastic Compute Cloud User Guide.

  allocate-address-request - `com.amazonaws.services.ec2.model.AllocateAddressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AllocateAddress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AllocateAddressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AllocateAddressRequest allocate-address-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.allocateAddressAsync allocate-address-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AllocateAddressRequest allocate-address-request]
    (-> this (.allocateAddressAsync allocate-address-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.allocateAddressAsync))))

(defn delete-route-async
  "Deletes the specified route from the specified route table.

  delete-route-request - `com.amazonaws.services.ec2.model.DeleteRouteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteRouteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteRouteRequest delete-route-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRouteAsync delete-route-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteRouteRequest delete-route-request]
    (-> this (.deleteRouteAsync delete-route-request))))

(defn describe-export-tasks-async
  "Describes the specified export tasks or all your export tasks.

  describe-export-tasks-request - `com.amazonaws.services.ec2.model.DescribeExportTasksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeExportTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeExportTasksResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeExportTasksRequest describe-export-tasks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeExportTasksAsync describe-export-tasks-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeExportTasksRequest describe-export-tasks-request]
    (-> this (.describeExportTasksAsync describe-export-tasks-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeExportTasksAsync))))

(defn describe-vpc-endpoints-async
  "Describes one or more of your VPC endpoints.

  describe-vpc-endpoints-request - Contains the parameters for DescribeVpcEndpoints. - `com.amazonaws.services.ec2.model.DescribeVpcEndpointsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpcEndpointsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointsRequest describe-vpc-endpoints-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcEndpointsAsync describe-vpc-endpoints-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointsRequest describe-vpc-endpoints-request]
    (-> this (.describeVpcEndpointsAsync describe-vpc-endpoints-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeVpcEndpointsAsync))))

(defn detach-volume-async
  "Detaches an EBS volume from an instance. Make sure to unmount any file systems on the device within your
   operating system before detaching the volume. Failure to do so can result in the volume becoming stuck in the
   busy state while detaching. If this happens, detachment can be delayed indefinitely until you
   unmount the volume, force detachment, reboot the instance, or all three. If an EBS volume is the root device of
   an instance, it can't be detached while the instance is running. To detach the root volume, stop the instance
   first.


   When a volume with an AWS Marketplace product code is detached from an instance, the product code is no longer
   associated with the instance.


   For more information, see Detaching an Amazon EBS
   Volume in the Amazon Elastic Compute Cloud User Guide.

  detach-volume-request - Contains the parameters for DetachVolume. - `com.amazonaws.services.ec2.model.DetachVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DetachVolumeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DetachVolumeRequest detach-volume-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachVolumeAsync detach-volume-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DetachVolumeRequest detach-volume-request]
    (-> this (.detachVolumeAsync detach-volume-request))))

(defn authorize-security-group-ingress-async
  "Adds the specified ingress rules to a security group.


   An inbound rule permits instances to receive traffic from the specified IPv4 or IPv6 CIDR address ranges, or from
   the instances associated with the specified destination security groups.


   You specify a protocol for each rule (for example, TCP). For TCP and UDP, you must also specify the destination
   port or port range. For ICMP/ICMPv6, you must also specify the ICMP/ICMPv6 type and code. You can use -1 to mean
   all types or all codes.


   Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay
   might occur.


   For more information about VPC security group limits, see Amazon VPC Limits.

  authorize-security-group-ingress-request - `com.amazonaws.services.ec2.model.AuthorizeSecurityGroupIngressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AuthorizeSecurityGroupIngress operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AuthorizeSecurityGroupIngressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AuthorizeSecurityGroupIngressRequest authorize-security-group-ingress-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.authorizeSecurityGroupIngressAsync authorize-security-group-ingress-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AuthorizeSecurityGroupIngressRequest authorize-security-group-ingress-request]
    (-> this (.authorizeSecurityGroupIngressAsync authorize-security-group-ingress-request))))

(defn disable-vpc-classic-link-dns-support-async
  "Disables ClassicLink DNS support for a VPC. If disabled, DNS hostnames resolve to public IP addresses when
   addressed between a linked EC2-Classic instance and instances in the VPC to which it's linked. For more
   information, see ClassicLink in the Amazon
   Elastic Compute Cloud User Guide.

  disable-vpc-classic-link-dns-support-request - `com.amazonaws.services.ec2.model.DisableVpcClassicLinkDnsSupportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableVpcClassicLinkDnsSupport operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisableVpcClassicLinkDnsSupportResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisableVpcClassicLinkDnsSupportRequest disable-vpc-classic-link-dns-support-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableVpcClassicLinkDnsSupportAsync disable-vpc-classic-link-dns-support-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisableVpcClassicLinkDnsSupportRequest disable-vpc-classic-link-dns-support-request]
    (-> this (.disableVpcClassicLinkDnsSupportAsync disable-vpc-classic-link-dns-support-request))))

(defn attach-classic-link-vpc-async
  "Links an EC2-Classic instance to a ClassicLink-enabled VPC through one or more of the VPC's security groups. You
   cannot link an EC2-Classic instance to more than one VPC at a time. You can only link an instance that's in the
   running state. An instance is automatically unlinked from a VPC when it's stopped - you can link it
   to the VPC again when you restart it.


   After you've linked an instance, you cannot change the VPC security groups that are associated with it. To change
   the security groups, you must first unlink the instance, and then link it again.


   Linking your instance to a VPC is sometimes referred to as attaching your instance.

  attach-classic-link-vpc-request - `com.amazonaws.services.ec2.model.AttachClassicLinkVpcRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachClassicLinkVpc operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AttachClassicLinkVpcResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AttachClassicLinkVpcRequest attach-classic-link-vpc-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachClassicLinkVpcAsync attach-classic-link-vpc-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AttachClassicLinkVpcRequest attach-classic-link-vpc-request]
    (-> this (.attachClassicLinkVpcAsync attach-classic-link-vpc-request))))

(defn describe-aggregate-id-format-async
  "Describes the longer ID format settings for all resource types in a specific Region. This request is useful for
   performing a quick audit to determine whether a specific Region is fully opted in for longer IDs (17-character
   IDs).


   This request only returns information about resource types that support longer IDs.


   The following resource types support longer IDs: bundle | conversion-task |
   customer-gateway | dhcp-options | elastic-ip-allocation |
   elastic-ip-association | export-task | flow-log | image |
   import-task | instance | internet-gateway | network-acl |
   network-acl-association | network-interface | network-interface-attachment
   | prefix-list | reservation | route-table |
   route-table-association | security-group | snapshot | subnet
   | subnet-cidr-block-association | volume | vpc |
   vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection |
   vpn-connection | vpn-gateway.

  describe-aggregate-id-format-request - `com.amazonaws.services.ec2.model.DescribeAggregateIdFormatRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAggregateIdFormat operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeAggregateIdFormatResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeAggregateIdFormatRequest describe-aggregate-id-format-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAggregateIdFormatAsync describe-aggregate-id-format-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeAggregateIdFormatRequest describe-aggregate-id-format-request]
    (-> this (.describeAggregateIdFormatAsync describe-aggregate-id-format-request))))

(defn describe-network-acls-async
  "Describes one or more of your network ACLs.


   For more information, see Network
   ACLs in the Amazon Virtual Private Cloud User Guide.

  describe-network-acls-request - `com.amazonaws.services.ec2.model.DescribeNetworkAclsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNetworkAcls operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeNetworkAclsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeNetworkAclsRequest describe-network-acls-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNetworkAclsAsync describe-network-acls-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeNetworkAclsRequest describe-network-acls-request]
    (-> this (.describeNetworkAclsAsync describe-network-acls-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeNetworkAclsAsync))))

(defn describe-spot-fleet-instances-async
  "Describes the running instances for the specified Spot Fleet.

  describe-spot-fleet-instances-request - Contains the parameters for DescribeSpotFleetInstances. - `com.amazonaws.services.ec2.model.DescribeSpotFleetInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSpotFleetInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeSpotFleetInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeSpotFleetInstancesRequest describe-spot-fleet-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSpotFleetInstancesAsync describe-spot-fleet-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeSpotFleetInstancesRequest describe-spot-fleet-instances-request]
    (-> this (.describeSpotFleetInstancesAsync describe-spot-fleet-instances-request))))

(defn delete-vpc-endpoint-connection-notifications-async
  "Deletes one or more VPC endpoint connection notifications.

  delete-vpc-endpoint-connection-notifications-request - `com.amazonaws.services.ec2.model.DeleteVpcEndpointConnectionNotificationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVpcEndpointConnectionNotifications operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteVpcEndpointConnectionNotificationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteVpcEndpointConnectionNotificationsRequest delete-vpc-endpoint-connection-notifications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVpcEndpointConnectionNotificationsAsync delete-vpc-endpoint-connection-notifications-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteVpcEndpointConnectionNotificationsRequest delete-vpc-endpoint-connection-notifications-request]
    (-> this (.deleteVpcEndpointConnectionNotificationsAsync delete-vpc-endpoint-connection-notifications-request))))

(defn describe-reserved-instances-modifications-async
  "Describes the modifications made to your Reserved Instances. If no parameter is specified, information about all
   your Reserved Instances modification requests is returned. If a modification ID is specified, only information
   about the specific modification is returned.


   For more information, see Modifying Reserved Instances in
   the Amazon Elastic Compute Cloud User Guide.

  describe-reserved-instances-modifications-request - Contains the parameters for DescribeReservedInstancesModifications. - `com.amazonaws.services.ec2.model.DescribeReservedInstancesModificationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedInstancesModifications operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeReservedInstancesModificationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesModificationsRequest describe-reserved-instances-modifications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedInstancesModificationsAsync describe-reserved-instances-modifications-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesModificationsRequest describe-reserved-instances-modifications-request]
    (-> this (.describeReservedInstancesModificationsAsync describe-reserved-instances-modifications-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeReservedInstancesModificationsAsync))))

(defn describe-traffic-mirror-filters-async
  "Describes one or more Traffic Mirror filters.

  describe-traffic-mirror-filters-request - `com.amazonaws.services.ec2.model.DescribeTrafficMirrorFiltersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTrafficMirrorFilters operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeTrafficMirrorFiltersResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeTrafficMirrorFiltersRequest describe-traffic-mirror-filters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTrafficMirrorFiltersAsync describe-traffic-mirror-filters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeTrafficMirrorFiltersRequest describe-traffic-mirror-filters-request]
    (-> this (.describeTrafficMirrorFiltersAsync describe-traffic-mirror-filters-request))))

(defn run-instances-async
  "Launches the specified number of instances using an AMI for which you have permissions.


   You can specify a number of options, or leave the default options. The following rules apply:




   [EC2-VPC] If you don't specify a subnet ID, we choose a default subnet from your default VPC for you. If you
   don't have a default VPC, you must specify a subnet ID in the request.




   [EC2-Classic] If don't specify an Availability Zone, we choose one for you.




   Some instance types must be launched into a VPC. If you do not have a default VPC, or if you do not specify a
   subnet ID, the request fails. For more information, see Instance Types
   Available Only in a VPC.




   [EC2-VPC] All instances have a network interface with a primary private IPv4 address. If you don't specify this
   address, we choose one from the IPv4 range of your subnet.




   Not all instance types support IPv6 addresses. For more information, see Instance Types.




   If you don't specify a security group ID, we use the default security group. For more information, see Security Groups.




   If any of the AMIs have a product code attached for which the user has not subscribed, the request fails.




   You can create a launch
   template, which is a resource that contains the parameters to launch an instance. When you launch an instance
   using RunInstances, you can specify the launch template instead of specifying the launch parameters.


   To ensure faster instance launches, break up large requests into smaller batches. For example, create five
   separate launch requests for 100 instances each instead of one launch request for 500 instances.


   An instance is ready for you to use when it's in the running state. You can check the state of your
   instance using DescribeInstances. You can tag instances and EBS volumes during launch, after launch, or
   both. For more information, see CreateTags and Tagging Your Amazon EC2 Resources.


   Linux instances have access to the public key of the key pair at boot. You can use this key to provide secure
   access to the instance. Amazon EC2 public images use this feature to provide secure access without passwords. For
   more information, see Key
   Pairs in the Amazon Elastic Compute Cloud User Guide.


   For troubleshooting, see What To Do If
   An Instance Immediately Terminates, and Troubleshooting Connecting to Your Instance in the Amazon Elastic Compute Cloud User Guide.

  run-instances-request - `com.amazonaws.services.ec2.model.RunInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RunInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RunInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RunInstancesRequest run-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.runInstancesAsync run-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RunInstancesRequest run-instances-request]
    (-> this (.runInstancesAsync run-instances-request))))

(defn delete-dhcp-options-async
  "Deletes the specified set of DHCP options. You must disassociate the set of DHCP options before you can delete
   it. You can disassociate the set of DHCP options by associating either a new set of options or the default set of
   options with the VPC.

  delete-dhcp-options-request - `com.amazonaws.services.ec2.model.DeleteDhcpOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDhcpOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteDhcpOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteDhcpOptionsRequest delete-dhcp-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDhcpOptionsAsync delete-dhcp-options-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteDhcpOptionsRequest delete-dhcp-options-request]
    (-> this (.deleteDhcpOptionsAsync delete-dhcp-options-request))))

(defn delete-vpc-endpoints-async
  "Deletes one or more specified VPC endpoints. Deleting a gateway endpoint also deletes the endpoint routes in the
   route tables that were associated with the endpoint. Deleting an interface endpoint deletes the endpoint network
   interfaces.

  delete-vpc-endpoints-request - Contains the parameters for DeleteVpcEndpoints. - `com.amazonaws.services.ec2.model.DeleteVpcEndpointsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVpcEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteVpcEndpointsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteVpcEndpointsRequest delete-vpc-endpoints-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVpcEndpointsAsync delete-vpc-endpoints-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteVpcEndpointsRequest delete-vpc-endpoints-request]
    (-> this (.deleteVpcEndpointsAsync delete-vpc-endpoints-request))))

(defn create-vpc-endpoint-async
  "Creates a VPC endpoint for a specified service. An endpoint enables you to create a private connection between
   your VPC and the service. The service may be provided by AWS, an AWS Marketplace partner, or another AWS account.
   For more information, see VPC
   Endpoints in the Amazon Virtual Private Cloud User Guide.


   A gateway endpoint serves as a target for a route in your route table for traffic destined for the
   AWS service. You can specify an endpoint policy to attach to the endpoint that will control access to the service
   from your VPC. You can also specify the VPC route tables that use the endpoint.


   An interface endpoint is a network interface in your subnet that serves as an endpoint for
   communicating with the specified service. You can specify the subnets in which to create an endpoint, and the
   security groups to associate with the endpoint network interface.


   Use DescribeVpcEndpointServices to get a list of supported services.

  create-vpc-endpoint-request - Contains the parameters for CreateVpcEndpoint. - `com.amazonaws.services.ec2.model.CreateVpcEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVpcEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateVpcEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateVpcEndpointRequest create-vpc-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVpcEndpointAsync create-vpc-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateVpcEndpointRequest create-vpc-endpoint-request]
    (-> this (.createVpcEndpointAsync create-vpc-endpoint-request))))

(defn modify-instance-placement-async
  "Modifies the placement attributes for a specified instance. You can do the following:




   Modify the affinity between an instance and a Dedicated Host. When
   affinity is set to host and the instance is not associated with a specific Dedicated Host, the next
   time the instance is launched, it is automatically associated with the host on which it lands. If the instance is
   restarted or rebooted, this relationship persists.




   Change the Dedicated Host with which an instance is associated.




   Change the instance tenancy of an instance from host to dedicated, or from
   dedicated to host.




   Move an instance to or from a placement group.




   At least one attribute for affinity, host ID, tenancy, or placement group name must be specified in the request.
   Affinity and tenancy can be modified in the same request.


   To modify the host ID, tenancy, placement group, or partition for an instance, the instance must be in the
   stopped state.

  modify-instance-placement-request - `com.amazonaws.services.ec2.model.ModifyInstancePlacementRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyInstancePlacement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyInstancePlacementResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyInstancePlacementRequest modify-instance-placement-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyInstancePlacementAsync modify-instance-placement-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyInstancePlacementRequest modify-instance-placement-request]
    (-> this (.modifyInstancePlacementAsync modify-instance-placement-request))))

(defn describe-addresses-async
  "Describes the specified Elastic IP addresses or all of your Elastic IP addresses.


   An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see Elastic IP Addresses
   in the Amazon Elastic Compute Cloud User Guide.

  describe-addresses-request - `com.amazonaws.services.ec2.model.DescribeAddressesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAddresses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeAddressesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeAddressesRequest describe-addresses-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAddressesAsync describe-addresses-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeAddressesRequest describe-addresses-request]
    (-> this (.describeAddressesAsync describe-addresses-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeAddressesAsync))))

(defn describe-vpn-gateways-async
  "Describes one or more of your virtual private gateways.


   For more information, see AWS Site-to-Site
   VPN in the AWS Site-to-Site VPN User Guide.

  describe-vpn-gateways-request - Contains the parameters for DescribeVpnGateways. - `com.amazonaws.services.ec2.model.DescribeVpnGatewaysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpnGateways operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpnGatewaysResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpnGatewaysRequest describe-vpn-gateways-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpnGatewaysAsync describe-vpn-gateways-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpnGatewaysRequest describe-vpn-gateways-request]
    (-> this (.describeVpnGatewaysAsync describe-vpn-gateways-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeVpnGatewaysAsync))))

(defn describe-byoip-cidrs-async
  "Describes the IP address ranges that were specified in calls to ProvisionByoipCidr.


   To describe the address pools that were created when you provisioned the address ranges, use
   DescribePublicIpv4Pools.

  describe-byoip-cidrs-request - `com.amazonaws.services.ec2.model.DescribeByoipCidrsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeByoipCidrs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeByoipCidrsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeByoipCidrsRequest describe-byoip-cidrs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeByoipCidrsAsync describe-byoip-cidrs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeByoipCidrsRequest describe-byoip-cidrs-request]
    (-> this (.describeByoipCidrsAsync describe-byoip-cidrs-request))))

(defn reject-vpc-peering-connection-async
  "Rejects a VPC peering connection request. The VPC peering connection must be in the
   pending-acceptance state. Use the DescribeVpcPeeringConnections request to view your
   outstanding VPC peering connection requests. To delete an active VPC peering connection, or to delete a VPC
   peering connection request that you initiated, use DeleteVpcPeeringConnection.

  reject-vpc-peering-connection-request - `com.amazonaws.services.ec2.model.RejectVpcPeeringConnectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RejectVpcPeeringConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RejectVpcPeeringConnectionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RejectVpcPeeringConnectionRequest reject-vpc-peering-connection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rejectVpcPeeringConnectionAsync reject-vpc-peering-connection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RejectVpcPeeringConnectionRequest reject-vpc-peering-connection-request]
    (-> this (.rejectVpcPeeringConnectionAsync reject-vpc-peering-connection-request))))

(defn revoke-client-vpn-ingress-async
  "Removes an ingress authorization rule from a Client VPN endpoint.

  revoke-client-vpn-ingress-request - `com.amazonaws.services.ec2.model.RevokeClientVpnIngressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeClientVpnIngress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RevokeClientVpnIngressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RevokeClientVpnIngressRequest revoke-client-vpn-ingress-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeClientVpnIngressAsync revoke-client-vpn-ingress-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RevokeClientVpnIngressRequest revoke-client-vpn-ingress-request]
    (-> this (.revokeClientVpnIngressAsync revoke-client-vpn-ingress-request))))

(defn assign-private-ip-addresses-async
  "Assigns one or more secondary private IP addresses to the specified network interface.


   You can specify one or more specific secondary IP addresses, or you can specify the number of secondary IP
   addresses to be automatically assigned within the subnet's CIDR block range. The number of secondary IP addresses
   that you can assign to an instance varies by instance type. For information about instance types, see Instance Types in the
   Amazon Elastic Compute Cloud User Guide. For more information about Elastic IP addresses, see Elastic IP Addresses
   in the Amazon Elastic Compute Cloud User Guide.


   When you move a secondary private IP address to another network interface, any Elastic IP address that is
   associated with the IP address is also moved.


   Remapping an IP address is an asynchronous operation. When you move an IP address from one network interface to
   another, check network/interfaces/macs/mac/local-ipv4s in the instance metadata to confirm that the
   remapping is complete.

  assign-private-ip-addresses-request - Contains the parameters for AssignPrivateIpAddresses. - `com.amazonaws.services.ec2.model.AssignPrivateIpAddressesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssignPrivateIpAddresses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AssignPrivateIpAddressesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AssignPrivateIpAddressesRequest assign-private-ip-addresses-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.assignPrivateIpAddressesAsync assign-private-ip-addresses-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AssignPrivateIpAddressesRequest assign-private-ip-addresses-request]
    (-> this (.assignPrivateIpAddressesAsync assign-private-ip-addresses-request))))

(defn reset-instance-attribute-async
  "Resets an attribute of an instance to its default value. To reset the kernel or ramdisk
   , the instance must be in a stopped state. To reset the sourceDestCheck, the instance can be either
   running or stopped.


   The sourceDestCheck attribute controls whether source/destination checking is enabled. The default
   value is true, which means checking is enabled. This value must be false for a NAT
   instance to perform NAT. For more information, see NAT Instances in the
   Amazon Virtual Private Cloud User Guide.

  reset-instance-attribute-request - `com.amazonaws.services.ec2.model.ResetInstanceAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetInstanceAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ResetInstanceAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ResetInstanceAttributeRequest reset-instance-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetInstanceAttributeAsync reset-instance-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ResetInstanceAttributeRequest reset-instance-attribute-request]
    (-> this (.resetInstanceAttributeAsync reset-instance-attribute-request))))

(defn replace-route-async
  "Replaces an existing route within a route table in a VPC. You must provide only one of the following: internet
   gateway or virtual private gateway, NAT instance, NAT gateway, VPC peering connection, network interface, or
   egress-only internet gateway.


   For more information, see Route
   Tables in the Amazon Virtual Private Cloud User Guide.

  replace-route-request - `com.amazonaws.services.ec2.model.ReplaceRouteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReplaceRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ReplaceRouteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ReplaceRouteRequest replace-route-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.replaceRouteAsync replace-route-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ReplaceRouteRequest replace-route-request]
    (-> this (.replaceRouteAsync replace-route-request))))

(defn create-fleet-async
  "Launches an EC2 Fleet.


   You can create a single EC2 Fleet that includes multiple launch specifications that vary by instance type, AMI,
   Availability Zone, or subnet.


   For more information, see Launching
   an EC2 Fleet in the Amazon Elastic Compute Cloud User Guide.

  create-fleet-request - `com.amazonaws.services.ec2.model.CreateFleetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateFleetResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateFleetRequest create-fleet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFleetAsync create-fleet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateFleetRequest create-fleet-request]
    (-> this (.createFleetAsync create-fleet-request))))

(defn associate-client-vpn-target-network-async
  "Associates a target network with a Client VPN endpoint. A target network is a subnet in a VPC. You can associate
   multiple subnets from the same VPC with a Client VPN endpoint. You can associate only one subnet in each
   Availability Zone. We recommend that you associate at least two subnets to provide Availability Zone redundancy.

  associate-client-vpn-target-network-request - `com.amazonaws.services.ec2.model.AssociateClientVpnTargetNetworkRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateClientVpnTargetNetwork operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AssociateClientVpnTargetNetworkResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AssociateClientVpnTargetNetworkRequest associate-client-vpn-target-network-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateClientVpnTargetNetworkAsync associate-client-vpn-target-network-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AssociateClientVpnTargetNetworkRequest associate-client-vpn-target-network-request]
    (-> this (.associateClientVpnTargetNetworkAsync associate-client-vpn-target-network-request))))

(defn delete-network-interface-permission-async
  "Deletes a permission for a network interface. By default, you cannot delete the permission if the account for
   which you're removing the permission has attached the network interface to an instance. However, you can force
   delete the permission, regardless of any attachment.

  delete-network-interface-permission-request - Contains the parameters for DeleteNetworkInterfacePermission. - `com.amazonaws.services.ec2.model.DeleteNetworkInterfacePermissionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNetworkInterfacePermission operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteNetworkInterfacePermissionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteNetworkInterfacePermissionRequest delete-network-interface-permission-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNetworkInterfacePermissionAsync delete-network-interface-permission-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteNetworkInterfacePermissionRequest delete-network-interface-permission-request]
    (-> this (.deleteNetworkInterfacePermissionAsync delete-network-interface-permission-request))))

(defn create-vpc-async
  "Creates a VPC with the specified IPv4 CIDR block. The smallest VPC you can create uses a /28 netmask (16 IPv4
   addresses), and the largest uses a /16 netmask (65,536 IPv4 addresses). For more information about how large to
   make your VPC, see Your VPC and
   Subnets in the Amazon Virtual Private Cloud User Guide.


   You can optionally request an Amazon-provided IPv6 CIDR block for the VPC. The IPv6 CIDR block uses a /56 prefix
   length, and is allocated from Amazon's pool of IPv6 addresses. You cannot choose the IPv6 range for your VPC.


   By default, each instance you launch in the VPC has the default DHCP options, which include only a default DNS
   server that we provide (AmazonProvidedDNS). For more information, see DHCP Options Sets in the
   Amazon Virtual Private Cloud User Guide.


   You can specify the instance tenancy value for the VPC when you create it. You can't change this value for the
   VPC after you create it. For more information, see Dedicated Instances in the
   Amazon Elastic Compute Cloud User Guide.

  create-vpc-request - `com.amazonaws.services.ec2.model.CreateVpcRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVpc operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateVpcResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateVpcRequest create-vpc-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVpcAsync create-vpc-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateVpcRequest create-vpc-request]
    (-> this (.createVpcAsync create-vpc-request))))

(defn get-launch-template-data-async
  "Retrieves the configuration data of the specified instance. You can use this data to create a launch template.

  get-launch-template-data-request - `com.amazonaws.services.ec2.model.GetLaunchTemplateDataRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLaunchTemplateData operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetLaunchTemplateDataResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetLaunchTemplateDataRequest get-launch-template-data-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLaunchTemplateDataAsync get-launch-template-data-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetLaunchTemplateDataRequest get-launch-template-data-request]
    (-> this (.getLaunchTemplateDataAsync get-launch-template-data-request))))

(defn attach-internet-gateway-async
  "Attaches an internet gateway to a VPC, enabling connectivity between the internet and the VPC. For more
   information about your VPC and internet gateway, see the Amazon Virtual Private Cloud User Guide.

  attach-internet-gateway-request - `com.amazonaws.services.ec2.model.AttachInternetGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachInternetGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AttachInternetGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AttachInternetGatewayRequest attach-internet-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachInternetGatewayAsync attach-internet-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AttachInternetGatewayRequest attach-internet-gateway-request]
    (-> this (.attachInternetGatewayAsync attach-internet-gateway-request))))

(defn reset-snapshot-attribute-async
  "Resets permission settings for the specified snapshot.


   For more information about modifying snapshot permissions, see Sharing
   Snapshots in the Amazon Elastic Compute Cloud User Guide.

  reset-snapshot-attribute-request - Contains the parameters for ResetSnapshotAttribute. - `com.amazonaws.services.ec2.model.ResetSnapshotAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetSnapshotAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ResetSnapshotAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ResetSnapshotAttributeRequest reset-snapshot-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetSnapshotAttributeAsync reset-snapshot-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ResetSnapshotAttributeRequest reset-snapshot-attribute-request]
    (-> this (.resetSnapshotAttributeAsync reset-snapshot-attribute-request))))

(defn describe-nat-gateways-async
  "Describes one or more of your NAT gateways.

  describe-nat-gateways-request - `com.amazonaws.services.ec2.model.DescribeNatGatewaysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNatGateways operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeNatGatewaysResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeNatGatewaysRequest describe-nat-gateways-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNatGatewaysAsync describe-nat-gateways-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeNatGatewaysRequest describe-nat-gateways-request]
    (-> this (.describeNatGatewaysAsync describe-nat-gateways-request))))

(defn copy-image-async
  "Initiates the copy of an AMI from the specified source Region to the current Region. You specify the destination
   Region by using its endpoint when making the request.


   Copies of encrypted backing snapshots for the AMI are encrypted. Copies of unencrypted backing snapshots remain
   unencrypted, unless you set Encrypted during the copy operation. You cannot create an unencrypted
   copy of an encrypted backing snapshot.


   For more information about the prerequisites and limits when copying an AMI, see Copying an AMI in the Amazon
   Elastic Compute Cloud User Guide.

  copy-image-request - Contains the parameters for CopyImage. - `com.amazonaws.services.ec2.model.CopyImageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CopyImageResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CopyImageRequest copy-image-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyImageAsync copy-image-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CopyImageRequest copy-image-request]
    (-> this (.copyImageAsync copy-image-request))))

(defn create-default-subnet-async
  "Creates a default subnet with a size /20 IPv4 CIDR block in the specified Availability Zone in your
   default VPC. You can have only one default subnet per Availability Zone. For more information, see Creating a Default
   Subnet in the Amazon Virtual Private Cloud User Guide.

  create-default-subnet-request - `com.amazonaws.services.ec2.model.CreateDefaultSubnetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDefaultSubnet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateDefaultSubnetResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateDefaultSubnetRequest create-default-subnet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDefaultSubnetAsync create-default-subnet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateDefaultSubnetRequest create-default-subnet-request]
    (-> this (.createDefaultSubnetAsync create-default-subnet-request))))

(defn delete-flow-logs-async
  "Deletes one or more flow logs.

  delete-flow-logs-request - `com.amazonaws.services.ec2.model.DeleteFlowLogsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFlowLogs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteFlowLogsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteFlowLogsRequest delete-flow-logs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFlowLogsAsync delete-flow-logs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteFlowLogsRequest delete-flow-logs-request]
    (-> this (.deleteFlowLogsAsync delete-flow-logs-request))))

(defn accept-vpc-endpoint-connections-async
  "Accepts one or more interface VPC endpoint connection requests to your VPC endpoint service.

  accept-vpc-endpoint-connections-request - `com.amazonaws.services.ec2.model.AcceptVpcEndpointConnectionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptVpcEndpointConnections operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AcceptVpcEndpointConnectionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AcceptVpcEndpointConnectionsRequest accept-vpc-endpoint-connections-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptVpcEndpointConnectionsAsync accept-vpc-endpoint-connections-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AcceptVpcEndpointConnectionsRequest accept-vpc-endpoint-connections-request]
    (-> this (.acceptVpcEndpointConnectionsAsync accept-vpc-endpoint-connections-request))))

(defn enable-ebs-encryption-by-default-async
  "Enables EBS encryption by default for your account in the current Region.


   After you enable encryption by default, the EBS volumes that you create are are always encrypted, either using
   the default CMK or the CMK that you specified when you created each volume. For more information, see Amazon EBS Encryption in the
   Amazon Elastic Compute Cloud User Guide.


   You can specify the default CMK for encryption by default using ModifyEbsDefaultKmsKeyId or
   ResetEbsDefaultKmsKeyId.


   Enabling encryption by default has no effect on the encryption status of your existing volumes.


   After you enable encryption by default, you can no longer launch instances using instance types that do not
   support encryption. For more information, see Supported Instance Types.

  enable-ebs-encryption-by-default-request - `com.amazonaws.services.ec2.model.EnableEbsEncryptionByDefaultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableEbsEncryptionByDefault operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.EnableEbsEncryptionByDefaultResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.EnableEbsEncryptionByDefaultRequest enable-ebs-encryption-by-default-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableEbsEncryptionByDefaultAsync enable-ebs-encryption-by-default-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.EnableEbsEncryptionByDefaultRequest enable-ebs-encryption-by-default-request]
    (-> this (.enableEbsEncryptionByDefaultAsync enable-ebs-encryption-by-default-request))))

(defn create-network-interface-async
  "Creates a network interface in the specified subnet.


   For more information about network interfaces, see Elastic Network Interfaces in the
   Amazon Virtual Private Cloud User Guide.

  create-network-interface-request - Contains the parameters for CreateNetworkInterface. - `com.amazonaws.services.ec2.model.CreateNetworkInterfaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNetworkInterface operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateNetworkInterfaceResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateNetworkInterfaceRequest create-network-interface-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNetworkInterfaceAsync create-network-interface-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateNetworkInterfaceRequest create-network-interface-request]
    (-> this (.createNetworkInterfaceAsync create-network-interface-request))))

(defn modify-network-interface-attribute-async
  "Modifies the specified network interface attribute. You can specify only one attribute at a time. You can use
   this action to attach and detach security groups from an existing EC2 instance.

  modify-network-interface-attribute-request - Contains the parameters for ModifyNetworkInterfaceAttribute. - `com.amazonaws.services.ec2.model.ModifyNetworkInterfaceAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyNetworkInterfaceAttribute operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyNetworkInterfaceAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyNetworkInterfaceAttributeRequest modify-network-interface-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyNetworkInterfaceAttributeAsync modify-network-interface-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyNetworkInterfaceAttributeRequest modify-network-interface-attribute-request]
    (-> this (.modifyNetworkInterfaceAttributeAsync modify-network-interface-attribute-request))))

(defn describe-identity-id-format-async
  "Describes the ID format settings for resources for the specified IAM user, IAM role, or root user. For example,
   you can view the resource types that are enabled for longer IDs. This request only returns information about
   resource types whose ID formats can be modified; it does not return information about other resource types. For
   more information, see Resource
   IDs in the Amazon Elastic Compute Cloud User Guide.


   The following resource types support longer IDs: bundle | conversion-task |
   customer-gateway | dhcp-options | elastic-ip-allocation |
   elastic-ip-association | export-task | flow-log | image |
   import-task | instance | internet-gateway | network-acl |
   network-acl-association | network-interface | network-interface-attachment
   | prefix-list | reservation | route-table |
   route-table-association | security-group | snapshot | subnet
   | subnet-cidr-block-association | volume | vpc |
   vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection |
   vpn-connection | vpn-gateway.


   These settings apply to the principal specified in the request. They do not apply to the principal that makes the
   request.

  describe-identity-id-format-request - `com.amazonaws.services.ec2.model.DescribeIdentityIdFormatRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIdentityIdFormat operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeIdentityIdFormatResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeIdentityIdFormatRequest describe-identity-id-format-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIdentityIdFormatAsync describe-identity-id-format-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeIdentityIdFormatRequest describe-identity-id-format-request]
    (-> this (.describeIdentityIdFormatAsync describe-identity-id-format-request))))

(defn describe-capacity-reservations-async
  "Describes one or more of your Capacity Reservations. The results describe only the Capacity Reservations in the
   AWS Region that you're currently using.

  describe-capacity-reservations-request - `com.amazonaws.services.ec2.model.DescribeCapacityReservationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCapacityReservations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeCapacityReservationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeCapacityReservationsRequest describe-capacity-reservations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCapacityReservationsAsync describe-capacity-reservations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeCapacityReservationsRequest describe-capacity-reservations-request]
    (-> this (.describeCapacityReservationsAsync describe-capacity-reservations-request))))

(defn create-route-table-async
  "Creates a route table for the specified VPC. After you create a route table, you can add routes and associate the
   table with a subnet.


   For more information, see Route
   Tables in the Amazon Virtual Private Cloud User Guide.

  create-route-table-request - `com.amazonaws.services.ec2.model.CreateRouteTableRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRouteTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateRouteTableResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateRouteTableRequest create-route-table-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRouteTableAsync create-route-table-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateRouteTableRequest create-route-table-request]
    (-> this (.createRouteTableAsync create-route-table-request))))

(defn associate-route-table-async
  "Associates a subnet with a route table. The subnet and route table must be in the same VPC. This association
   causes traffic originating from the subnet to be routed according to the routes in the route table. The action
   returns an association ID, which you need in order to disassociate the route table from the subnet later. A route
   table can be associated with multiple subnets.


   For more information, see Route
   Tables in the Amazon Virtual Private Cloud User Guide.

  associate-route-table-request - `com.amazonaws.services.ec2.model.AssociateRouteTableRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateRouteTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AssociateRouteTableResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AssociateRouteTableRequest associate-route-table-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateRouteTableAsync associate-route-table-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AssociateRouteTableRequest associate-route-table-request]
    (-> this (.associateRouteTableAsync associate-route-table-request))))

(defn modify-launch-template-async
  "Modifies a launch template. You can specify which version of the launch template to set as the default version.
   When launching an instance, the default version applies when a launch template version is not specified.

  modify-launch-template-request - `com.amazonaws.services.ec2.model.ModifyLaunchTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyLaunchTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyLaunchTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyLaunchTemplateRequest modify-launch-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyLaunchTemplateAsync modify-launch-template-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyLaunchTemplateRequest modify-launch-template-request]
    (-> this (.modifyLaunchTemplateAsync modify-launch-template-request))))

(defn create-traffic-mirror-session-async
  "Creates a Traffic Mirror session.


   A Traffic Mirror session actively copies packets from a Traffic Mirror source to a Traffic Mirror target. Create
   a filter, and then assign it to the session to define a subset of the traffic to mirror, for example all TCP
   traffic.


   The Traffic Mirror source and the Traffic Mirror target (monitoring appliances) can be in the same VPC, or in a
   different VPC connected via VPC peering or a transit gateway.


   By default, no traffic is mirrored. Use CreateTrafficMirrorFilter to create filter rules that specify the
   traffic to mirror.

  create-traffic-mirror-session-request - `com.amazonaws.services.ec2.model.CreateTrafficMirrorSessionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTrafficMirrorSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateTrafficMirrorSessionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorSessionRequest create-traffic-mirror-session-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTrafficMirrorSessionAsync create-traffic-mirror-session-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorSessionRequest create-traffic-mirror-session-request]
    (-> this (.createTrafficMirrorSessionAsync create-traffic-mirror-session-request))))

(defn describe-client-vpn-routes-async
  "Describes the routes for the specified Client VPN endpoint.

  describe-client-vpn-routes-request - `com.amazonaws.services.ec2.model.DescribeClientVpnRoutesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClientVpnRoutes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeClientVpnRoutesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeClientVpnRoutesRequest describe-client-vpn-routes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClientVpnRoutesAsync describe-client-vpn-routes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeClientVpnRoutesRequest describe-client-vpn-routes-request]
    (-> this (.describeClientVpnRoutesAsync describe-client-vpn-routes-request))))

(defn cancel-spot-instance-requests-async
  "Cancels one or more Spot Instance requests.



   Canceling a Spot Instance request does not terminate running Spot Instances associated with the request.

  cancel-spot-instance-requests-request - Contains the parameters for CancelSpotInstanceRequests. - `com.amazonaws.services.ec2.model.CancelSpotInstanceRequestsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelSpotInstanceRequests operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CancelSpotInstanceRequestsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CancelSpotInstanceRequestsRequest cancel-spot-instance-requests-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelSpotInstanceRequestsAsync cancel-spot-instance-requests-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CancelSpotInstanceRequestsRequest cancel-spot-instance-requests-request]
    (-> this (.cancelSpotInstanceRequestsAsync cancel-spot-instance-requests-request))))

(defn modify-image-attribute-async
  "Modifies the specified attribute of the specified AMI. You can specify only one attribute at a time. You can use
   the Attribute parameter to specify the attribute or one of the following parameters:
   Description, LaunchPermission, or ProductCode.


   AWS Marketplace product codes cannot be modified. Images with an AWS Marketplace product code cannot be made
   public.


   To enable the SriovNetSupport enhanced networking attribute of an image, enable SriovNetSupport on an instance
   and create an AMI from the instance.

  modify-image-attribute-request - Contains the parameters for ModifyImageAttribute. - `com.amazonaws.services.ec2.model.ModifyImageAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyImageAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyImageAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyImageAttributeRequest modify-image-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyImageAttributeAsync modify-image-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyImageAttributeRequest modify-image-attribute-request]
    (-> this (.modifyImageAttributeAsync modify-image-attribute-request))))

(defn create-dhcp-options-async
  "Creates a set of DHCP options for your VPC. After creating the set, you must associate it with the VPC, causing
   all existing and new instances that you launch in the VPC to use this set of DHCP options. The following are the
   individual DHCP options you can specify. For more information about the options, see RFC 2132.




   domain-name-servers - The IP addresses of up to four domain name servers, or AmazonProvidedDNS. The
   default DHCP option set specifies AmazonProvidedDNS. If specifying more than one domain name server, specify the
   IP addresses in a single parameter, separated by commas. To have your instance receive a custom DNS hostname as
   specified in domain-name, you must set domain-name-servers to a custom DNS server.




   domain-name - If you're using AmazonProvidedDNS in us-east-1, specify
   ec2.internal. If you're using AmazonProvidedDNS in another Region, specify
   region.compute.internal (for example, ap-northeast-1.compute.internal). Otherwise,
   specify a domain name (for example, MyCompany.com). This value is used to complete unqualified DNS
   hostnames. Important: Some Linux operating systems accept multiple domain names separated by spaces.
   However, Windows and other Linux operating systems treat the value as a single domain, which results in
   unexpected behavior. If your DHCP options set is associated with a VPC that has instances with multiple operating
   systems, specify only one domain name.




   ntp-servers - The IP addresses of up to four Network Time Protocol (NTP) servers.




   netbios-name-servers - The IP addresses of up to four NetBIOS name servers.




   netbios-node-type - The NetBIOS node type (1, 2, 4, or 8). We recommend that you specify 2
   (broadcast and multicast are not currently supported). For more information about these node types, see RFC 2132.




   Your VPC automatically starts out with a set of DHCP options that includes only a DNS server that we provide
   (AmazonProvidedDNS). If you create a set of options, and if your VPC has an internet gateway, make sure to set
   the domain-name-servers option either to AmazonProvidedDNS or to a domain name server
   of your choice. For more information, see DHCP Options Sets in the
   Amazon Virtual Private Cloud User Guide.

  create-dhcp-options-request - `com.amazonaws.services.ec2.model.CreateDhcpOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDhcpOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateDhcpOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateDhcpOptionsRequest create-dhcp-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDhcpOptionsAsync create-dhcp-options-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateDhcpOptionsRequest create-dhcp-options-request]
    (-> this (.createDhcpOptionsAsync create-dhcp-options-request))))

(defn create-transit-gateway-route-async
  "Creates a static route for the specified transit gateway route table.

  create-transit-gateway-route-request - `com.amazonaws.services.ec2.model.CreateTransitGatewayRouteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTransitGatewayRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateTransitGatewayRouteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateTransitGatewayRouteRequest create-transit-gateway-route-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTransitGatewayRouteAsync create-transit-gateway-route-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateTransitGatewayRouteRequest create-transit-gateway-route-request]
    (-> this (.createTransitGatewayRouteAsync create-transit-gateway-route-request))))

(defn describe-classic-link-instances-async
  "Describes one or more of your linked EC2-Classic instances. This request only returns information about
   EC2-Classic instances linked to a VPC through ClassicLink. You cannot use this request to return information
   about other instances.

  describe-classic-link-instances-request - `com.amazonaws.services.ec2.model.DescribeClassicLinkInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClassicLinkInstances operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeClassicLinkInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeClassicLinkInstancesRequest describe-classic-link-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClassicLinkInstancesAsync describe-classic-link-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeClassicLinkInstancesRequest describe-classic-link-instances-request]
    (-> this (.describeClassicLinkInstancesAsync describe-classic-link-instances-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeClassicLinkInstancesAsync))))

(defn delete-spot-datafeed-subscription-async
  "Deletes the data feed for Spot Instances.

  delete-spot-datafeed-subscription-request - Contains the parameters for DeleteSpotDatafeedSubscription. - `com.amazonaws.services.ec2.model.DeleteSpotDatafeedSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSpotDatafeedSubscription operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteSpotDatafeedSubscriptionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteSpotDatafeedSubscriptionRequest delete-spot-datafeed-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSpotDatafeedSubscriptionAsync delete-spot-datafeed-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteSpotDatafeedSubscriptionRequest delete-spot-datafeed-subscription-request]
    (-> this (.deleteSpotDatafeedSubscriptionAsync delete-spot-datafeed-subscription-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.deleteSpotDatafeedSubscriptionAsync))))

(defn delete-transit-gateway-route-table-async
  "Deletes the specified transit gateway route table. You must disassociate the route table from any transit gateway
   route tables before you can delete it.

  delete-transit-gateway-route-table-request - `com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteTableRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTransitGatewayRouteTable operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteTableResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteTableRequest delete-transit-gateway-route-table-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTransitGatewayRouteTableAsync delete-transit-gateway-route-table-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteTableRequest delete-transit-gateway-route-table-request]
    (-> this (.deleteTransitGatewayRouteTableAsync delete-transit-gateway-route-table-request))))

(defn describe-iam-instance-profile-associations-async
  "Describes your IAM instance profile associations.

  describe-iam-instance-profile-associations-request - `com.amazonaws.services.ec2.model.DescribeIamInstanceProfileAssociationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIamInstanceProfileAssociations operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeIamInstanceProfileAssociationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeIamInstanceProfileAssociationsRequest describe-iam-instance-profile-associations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIamInstanceProfileAssociationsAsync describe-iam-instance-profile-associations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeIamInstanceProfileAssociationsRequest describe-iam-instance-profile-associations-request]
    (-> this (.describeIamInstanceProfileAssociationsAsync describe-iam-instance-profile-associations-request))))

(defn get-console-output-async
  "Gets the console output for the specified instance. For Linux instances, the instance console output displays the
   exact console output that would normally be displayed on a physical monitor attached to a computer. For Windows
   instances, the instance console output includes the last three system event log errors.


   By default, the console output returns buffered information that was posted shortly after an instance transition
   state (start, stop, reboot, or terminate). This information is available for at least one hour after the most
   recent post. Only the most recent 64 KB of console output is available.


   You can optionally retrieve the latest serial console output at any time during the instance lifecycle. This
   option is supported on instance types that use the Nitro hypervisor.


   For more information, see Instance Console Output in the Amazon Elastic Compute Cloud User Guide.

  get-console-output-request - `com.amazonaws.services.ec2.model.GetConsoleOutputRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConsoleOutput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetConsoleOutputResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetConsoleOutputRequest get-console-output-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConsoleOutputAsync get-console-output-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetConsoleOutputRequest get-console-output-request]
    (-> this (.getConsoleOutputAsync get-console-output-request))))

(defn replace-network-acl-association-async
  "Changes which network ACL a subnet is associated with. By default when you create a subnet, it's automatically
   associated with the default network ACL. For more information, see Network ACLs in the Amazon Virtual
   Private Cloud User Guide.


   This is an idempotent operation.

  replace-network-acl-association-request - `com.amazonaws.services.ec2.model.ReplaceNetworkAclAssociationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReplaceNetworkAclAssociation operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ReplaceNetworkAclAssociationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ReplaceNetworkAclAssociationRequest replace-network-acl-association-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.replaceNetworkAclAssociationAsync replace-network-acl-association-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ReplaceNetworkAclAssociationRequest replace-network-acl-association-request]
    (-> this (.replaceNetworkAclAssociationAsync replace-network-acl-association-request))))

(defn describe-transit-gateways-async
  "Describes one or more transit gateways. By default, all transit gateways are described. Alternatively, you can
   filter the results.

  describe-transit-gateways-request - `com.amazonaws.services.ec2.model.DescribeTransitGatewaysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTransitGateways operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeTransitGatewaysResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeTransitGatewaysRequest describe-transit-gateways-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTransitGatewaysAsync describe-transit-gateways-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeTransitGatewaysRequest describe-transit-gateways-request]
    (-> this (.describeTransitGatewaysAsync describe-transit-gateways-request))))

(defn describe-client-vpn-endpoints-async
  "Describes one or more Client VPN endpoints in the account.

  describe-client-vpn-endpoints-request - `com.amazonaws.services.ec2.model.DescribeClientVpnEndpointsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClientVpnEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeClientVpnEndpointsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeClientVpnEndpointsRequest describe-client-vpn-endpoints-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClientVpnEndpointsAsync describe-client-vpn-endpoints-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeClientVpnEndpointsRequest describe-client-vpn-endpoints-request]
    (-> this (.describeClientVpnEndpointsAsync describe-client-vpn-endpoints-request))))

(defn describe-fleet-history-async
  "Describes the events for the specified EC2 Fleet during the specified time.

  describe-fleet-history-request - `com.amazonaws.services.ec2.model.DescribeFleetHistoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFleetHistory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeFleetHistoryResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeFleetHistoryRequest describe-fleet-history-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFleetHistoryAsync describe-fleet-history-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeFleetHistoryRequest describe-fleet-history-request]
    (-> this (.describeFleetHistoryAsync describe-fleet-history-request))))

(defn create-traffic-mirror-target-async
  "Creates a target for your Traffic Mirror session.


   A Traffic Mirror target is the destination for mirrored traffic. The Traffic Mirror source and the Traffic Mirror
   target (monitoring appliances) can be in the same VPC, or in different VPCs connected via VPC peering or a
   transit gateway.


   A Traffic Mirror target can be a network interface, or a Network Load Balancer.


   To use the target in a Traffic Mirror session, use CreateTrafficMirrorSession.

  create-traffic-mirror-target-request - `com.amazonaws.services.ec2.model.CreateTrafficMirrorTargetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTrafficMirrorTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateTrafficMirrorTargetResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorTargetRequest create-traffic-mirror-target-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTrafficMirrorTargetAsync create-traffic-mirror-target-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorTargetRequest create-traffic-mirror-target-request]
    (-> this (.createTrafficMirrorTargetAsync create-traffic-mirror-target-request))))

(defn create-internet-gateway-async
  "Creates an internet gateway for use with a VPC. After creating the internet gateway, you attach it to a VPC using
   AttachInternetGateway.


   For more information about your VPC and internet gateway, see the Amazon Virtual Private Cloud User Guide.

  create-internet-gateway-request - `com.amazonaws.services.ec2.model.CreateInternetGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInternetGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateInternetGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateInternetGatewayRequest create-internet-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInternetGatewayAsync create-internet-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateInternetGatewayRequest create-internet-gateway-request]
    (-> this (.createInternetGatewayAsync create-internet-gateway-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.createInternetGatewayAsync))))

(defn create-subnet-async
  "Creates a subnet in an existing VPC.


   When you create each subnet, you provide the VPC ID and IPv4 CIDR block for the subnet. After you create a
   subnet, you can't change its CIDR block. The size of the subnet's IPv4 CIDR block can be the same as a VPC's IPv4
   CIDR block, or a subset of a VPC's IPv4 CIDR block. If you create more than one subnet in a VPC, the subnets'
   CIDR blocks must not overlap. The smallest IPv4 subnet (and VPC) you can create uses a /28 netmask (16 IPv4
   addresses), and the largest uses a /16 netmask (65,536 IPv4 addresses).


   If you've associated an IPv6 CIDR block with your VPC, you can create a subnet with an IPv6 CIDR block that uses
   a /64 prefix length.



   AWS reserves both the first four and the last IPv4 address in each subnet's CIDR block. They're not available for
   use.



   If you add more than one subnet to a VPC, they're set up in a star topology with a logical router in the middle.


   If you launch an instance in a VPC using an Amazon EBS-backed AMI, the IP address doesn't change if you stop and
   restart the instance (unlike a similar instance launched outside a VPC, which gets a new IP address when
   restarted). It's therefore possible to have a subnet with no running instances (they're all stopped), but no
   remaining IP addresses available.


   For more information about subnets, see Your VPC and Subnets in the
   Amazon Virtual Private Cloud User Guide.

  create-subnet-request - `com.amazonaws.services.ec2.model.CreateSubnetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSubnet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateSubnetResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateSubnetRequest create-subnet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSubnetAsync create-subnet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateSubnetRequest create-subnet-request]
    (-> this (.createSubnetAsync create-subnet-request))))

(defn reject-vpc-endpoint-connections-async
  "Rejects one or more VPC endpoint connection requests to your VPC endpoint service.

  reject-vpc-endpoint-connections-request - `com.amazonaws.services.ec2.model.RejectVpcEndpointConnectionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RejectVpcEndpointConnections operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RejectVpcEndpointConnectionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RejectVpcEndpointConnectionsRequest reject-vpc-endpoint-connections-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rejectVpcEndpointConnectionsAsync reject-vpc-endpoint-connections-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RejectVpcEndpointConnectionsRequest reject-vpc-endpoint-connections-request]
    (-> this (.rejectVpcEndpointConnectionsAsync reject-vpc-endpoint-connections-request))))

(defn unassign-private-ip-addresses-async
  "Unassigns one or more secondary private IP addresses from a network interface.

  unassign-private-ip-addresses-request - Contains the parameters for UnassignPrivateIpAddresses. - `com.amazonaws.services.ec2.model.UnassignPrivateIpAddressesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnassignPrivateIpAddresses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.UnassignPrivateIpAddressesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.UnassignPrivateIpAddressesRequest unassign-private-ip-addresses-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unassignPrivateIpAddressesAsync unassign-private-ip-addresses-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.UnassignPrivateIpAddressesRequest unassign-private-ip-addresses-request]
    (-> this (.unassignPrivateIpAddressesAsync unassign-private-ip-addresses-request))))

(defn describe-volumes-modifications-async
  "Reports the current modification status of EBS volumes.


   Current-generation EBS volumes support modification of attributes including type, size, and (for io1
   volumes) IOPS provisioning while either attached to or detached from an instance. Following an action from the
   API or the console to modify a volume, the status of the modification may be modifying,
   optimizing, completed, or failed. If a volume has never been modified,
   then certain elements of the returned VolumeModification objects are null.


   You can also use CloudWatch Events to check the status of a modification to an EBS volume. For information about
   CloudWatch Events, see the Amazon
   CloudWatch Events User Guide. For more information, see Monitoring
   Volume Modifications\" in the Amazon Elastic Compute Cloud User Guide.

  describe-volumes-modifications-request - `com.amazonaws.services.ec2.model.DescribeVolumesModificationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVolumesModifications operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVolumesModificationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVolumesModificationsRequest describe-volumes-modifications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVolumesModificationsAsync describe-volumes-modifications-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVolumesModificationsRequest describe-volumes-modifications-request]
    (-> this (.describeVolumesModificationsAsync describe-volumes-modifications-request))))

(defn describe-snapshots-async
  "Describes the specified EBS snapshots available to you or all of the EBS snapshots available to you.


   The snapshots available to you include public snapshots, private snapshots that you own, and private snapshots
   owned by other AWS accounts for which you have explicit create volume permissions.


   The create volume permissions fall into the following categories:




   public: The owner of the snapshot granted create volume permissions for the snapshot to the
   all group. All AWS accounts have create volume permissions for these snapshots.




   explicit: The owner of the snapshot granted create volume permissions to a specific AWS account.




   implicit: An AWS account has implicit create volume permissions for all snapshots it owns.




   The list of snapshots returned can be modified by specifying snapshot IDs, snapshot owners, or AWS accounts with
   create volume permissions. If no options are specified, Amazon EC2 returns all snapshots for which you have
   create volume permissions.


   If you specify one or more snapshot IDs, only snapshots that have the specified IDs are returned. If you specify
   an invalid snapshot ID, an error is returned. If you specify a snapshot ID for which you do not have access, it
   is not included in the returned results.


   If you specify one or more snapshot owners using the OwnerIds option, only snapshots from the
   specified owners and for which you have access are returned. The results can include the AWS account IDs of the
   specified owners, amazon for snapshots owned by Amazon, or self for snapshots that you
   own.


   If you specify a list of restorable users, only snapshots with create snapshot permissions for those users are
   returned. You can specify AWS account IDs (if you own the snapshots), self for snapshots for which
   you own or have explicit permissions, or all for public snapshots.


   If you are describing a long list of snapshots, you can paginate the output to make the list more manageable. The
   MaxResults parameter sets the maximum number of results returned in a single page. If the list of
   results exceeds your MaxResults value, then that number of results is returned along with a
   NextToken value that can be passed to a subsequent DescribeSnapshots request to
   retrieve the remaining results.


   For more information about EBS snapshots, see Amazon EBS Snapshots in the
   Amazon Elastic Compute Cloud User Guide.

  describe-snapshots-request - `com.amazonaws.services.ec2.model.DescribeSnapshotsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeSnapshotsRequest describe-snapshots-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSnapshotsAsync describe-snapshots-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeSnapshotsRequest describe-snapshots-request]
    (-> this (.describeSnapshotsAsync describe-snapshots-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeSnapshotsAsync))))

(defn create-tags-async
  "Adds or overwrites the specified tags for the specified Amazon EC2 resource or resources. Each resource can have
   a maximum of 50 tags. Each tag consists of a key and optional value. Tag keys must be unique per resource.


   For more information about tags, see Tagging Your Resources in the
   Amazon Elastic Compute Cloud User Guide. For more information about creating IAM policies that control
   users' access to resources based on tags, see Supported
   Resource-Level Permissions for Amazon EC2 API Actions in the Amazon Elastic Compute Cloud User Guide.

  create-tags-request - `com.amazonaws.services.ec2.model.CreateTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateTagsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateTagsRequest create-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTagsAsync create-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateTagsRequest create-tags-request]
    (-> this (.createTagsAsync create-tags-request))))

(defn describe-volume-attribute-async
  "Describes the specified attribute of the specified volume. You can specify only one attribute at a time.


   For more information about EBS volumes, see Amazon EBS Volumes in the
   Amazon Elastic Compute Cloud User Guide.

  describe-volume-attribute-request - Contains the parameters for DescribeVolumeAttribute. - `com.amazonaws.services.ec2.model.DescribeVolumeAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVolumeAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVolumeAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVolumeAttributeRequest describe-volume-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVolumeAttributeAsync describe-volume-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVolumeAttributeRequest describe-volume-attribute-request]
    (-> this (.describeVolumeAttributeAsync describe-volume-attribute-request))))

(defn describe-reserved-instances-offerings-async
  "Describes Reserved Instance offerings that are available for purchase. With Reserved Instances, you purchase the
   right to launch instances for a period of time. During that time period, you do not receive insufficient capacity
   errors, and you pay a lower usage rate than the rate charged for On-Demand instances for the actual time used.


   If you have listed your own Reserved Instances for sale in the Reserved Instance Marketplace, they will be
   excluded from these results. This is to ensure that you do not purchase your own Reserved Instances.


   For more information, see Reserved Instance
   Marketplace in the Amazon Elastic Compute Cloud User Guide.

  describe-reserved-instances-offerings-request - Contains the parameters for DescribeReservedInstancesOfferings. - `com.amazonaws.services.ec2.model.DescribeReservedInstancesOfferingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedInstancesOfferings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeReservedInstancesOfferingsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesOfferingsRequest describe-reserved-instances-offerings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedInstancesOfferingsAsync describe-reserved-instances-offerings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesOfferingsRequest describe-reserved-instances-offerings-request]
    (-> this (.describeReservedInstancesOfferingsAsync describe-reserved-instances-offerings-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeReservedInstancesOfferingsAsync))))

(defn apply-security-groups-to-client-vpn-target-network-async
  "Applies a security group to the association between the target network and the Client VPN endpoint. This action
   replaces the existing security groups with the specified security groups.

  apply-security-groups-to-client-vpn-target-network-request - `com.amazonaws.services.ec2.model.ApplySecurityGroupsToClientVpnTargetNetworkRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ApplySecurityGroupsToClientVpnTargetNetwork operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ApplySecurityGroupsToClientVpnTargetNetworkResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ApplySecurityGroupsToClientVpnTargetNetworkRequest apply-security-groups-to-client-vpn-target-network-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.applySecurityGroupsToClientVpnTargetNetworkAsync apply-security-groups-to-client-vpn-target-network-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ApplySecurityGroupsToClientVpnTargetNetworkRequest apply-security-groups-to-client-vpn-target-network-request]
    (-> this (.applySecurityGroupsToClientVpnTargetNetworkAsync apply-security-groups-to-client-vpn-target-network-request))))

(defn create-network-interface-permission-async
  "Grants an AWS-authorized account permission to attach the specified network interface to an instance in their
   account.


   You can grant permission to a single AWS account only, and only one account at a time.

  create-network-interface-permission-request - Contains the parameters for CreateNetworkInterfacePermission. - `com.amazonaws.services.ec2.model.CreateNetworkInterfacePermissionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNetworkInterfacePermission operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateNetworkInterfacePermissionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateNetworkInterfacePermissionRequest create-network-interface-permission-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNetworkInterfacePermissionAsync create-network-interface-permission-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateNetworkInterfacePermissionRequest create-network-interface-permission-request]
    (-> this (.createNetworkInterfacePermissionAsync create-network-interface-permission-request))))

(defn get-transit-gateway-route-table-propagations-async
  "Gets information about the route table propagations for the specified transit gateway route table.

  get-transit-gateway-route-table-propagations-request - `com.amazonaws.services.ec2.model.GetTransitGatewayRouteTablePropagationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTransitGatewayRouteTablePropagations operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetTransitGatewayRouteTablePropagationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetTransitGatewayRouteTablePropagationsRequest get-transit-gateway-route-table-propagations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTransitGatewayRouteTablePropagationsAsync get-transit-gateway-route-table-propagations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetTransitGatewayRouteTablePropagationsRequest get-transit-gateway-route-table-propagations-request]
    (-> this (.getTransitGatewayRouteTablePropagationsAsync get-transit-gateway-route-table-propagations-request))))

(defn import-instance-async
  "Creates an import instance task using metadata from the specified disk image. ImportInstance only
   supports single-volume VMs. To import multi-volume VMs, use ImportImage. For more information, see Importing a
   Virtual Machine Using the Amazon EC2 CLI.


   For information about the import manifest referenced by this API action, see VM Import Manifest.

  import-instance-request - `com.amazonaws.services.ec2.model.ImportInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ImportInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ImportInstanceRequest import-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importInstanceAsync import-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ImportInstanceRequest import-instance-request]
    (-> this (.importInstanceAsync import-instance-request))))

(defn describe-host-reservations-async
  "Describes reservations that are associated with Dedicated Hosts in your account.

  describe-host-reservations-request - `com.amazonaws.services.ec2.model.DescribeHostReservationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeHostReservations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeHostReservationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeHostReservationsRequest describe-host-reservations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeHostReservationsAsync describe-host-reservations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeHostReservationsRequest describe-host-reservations-request]
    (-> this (.describeHostReservationsAsync describe-host-reservations-request))))

(defn deprovision-byoip-cidr-async
  "Releases the specified address range that you provisioned for use with your AWS resources through bring your own
   IP addresses (BYOIP) and deletes the corresponding address pool.


   Before you can release an address range, you must stop advertising it using WithdrawByoipCidr and you must
   not have any IP addresses allocated from its address range.

  deprovision-byoip-cidr-request - `com.amazonaws.services.ec2.model.DeprovisionByoipCidrRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeprovisionByoipCidr operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeprovisionByoipCidrResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeprovisionByoipCidrRequest deprovision-byoip-cidr-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deprovisionByoipCidrAsync deprovision-byoip-cidr-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeprovisionByoipCidrRequest deprovision-byoip-cidr-request]
    (-> this (.deprovisionByoipCidrAsync deprovision-byoip-cidr-request))))

(defn purchase-scheduled-instances-async
  "Purchases the Scheduled Instances with the specified schedule.


   Scheduled Instances enable you to purchase Amazon EC2 compute capacity by the hour for a one-year term. Before
   you can purchase a Scheduled Instance, you must call DescribeScheduledInstanceAvailability to check for
   available schedules and obtain a purchase token. After you purchase a Scheduled Instance, you must call
   RunScheduledInstances during each scheduled time period.


   After you purchase a Scheduled Instance, you can't cancel, modify, or resell your purchase.

  purchase-scheduled-instances-request - Contains the parameters for PurchaseScheduledInstances. - `com.amazonaws.services.ec2.model.PurchaseScheduledInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PurchaseScheduledInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.PurchaseScheduledInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.PurchaseScheduledInstancesRequest purchase-scheduled-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.purchaseScheduledInstancesAsync purchase-scheduled-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.PurchaseScheduledInstancesRequest purchase-scheduled-instances-request]
    (-> this (.purchaseScheduledInstancesAsync purchase-scheduled-instances-request))))

(defn describe-vpc-endpoint-connection-notifications-async
  "Describes the connection notifications for VPC endpoints and VPC endpoint services.

  describe-vpc-endpoint-connection-notifications-request - `com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionNotificationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcEndpointConnectionNotifications operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionNotificationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionNotificationsRequest describe-vpc-endpoint-connection-notifications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcEndpointConnectionNotificationsAsync describe-vpc-endpoint-connection-notifications-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionNotificationsRequest describe-vpc-endpoint-connection-notifications-request]
    (-> this (.describeVpcEndpointConnectionNotificationsAsync describe-vpc-endpoint-connection-notifications-request))))

(defn describe-internet-gateways-async
  "Describes one or more of your internet gateways.

  describe-internet-gateways-request - `com.amazonaws.services.ec2.model.DescribeInternetGatewaysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInternetGateways operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeInternetGatewaysResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeInternetGatewaysRequest describe-internet-gateways-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInternetGatewaysAsync describe-internet-gateways-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeInternetGatewaysRequest describe-internet-gateways-request]
    (-> this (.describeInternetGatewaysAsync describe-internet-gateways-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeInternetGatewaysAsync))))

(defn modify-fleet-async
  "Modifies the specified EC2 Fleet.


   While the EC2 Fleet is being modified, it is in the modifying state.

  modify-fleet-request - `com.amazonaws.services.ec2.model.ModifyFleetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyFleetResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyFleetRequest modify-fleet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyFleetAsync modify-fleet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyFleetRequest modify-fleet-request]
    (-> this (.modifyFleetAsync modify-fleet-request))))

(defn delete-egress-only-internet-gateway-async
  "Deletes an egress-only internet gateway.

  delete-egress-only-internet-gateway-request - `com.amazonaws.services.ec2.model.DeleteEgressOnlyInternetGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEgressOnlyInternetGateway operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteEgressOnlyInternetGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteEgressOnlyInternetGatewayRequest delete-egress-only-internet-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEgressOnlyInternetGatewayAsync delete-egress-only-internet-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteEgressOnlyInternetGatewayRequest delete-egress-only-internet-gateway-request]
    (-> this (.deleteEgressOnlyInternetGatewayAsync delete-egress-only-internet-gateway-request))))

(defn release-address-async
  "Releases the specified Elastic IP address.


   [EC2-Classic, default VPC] Releasing an Elastic IP address automatically disassociates it from any instance that
   it's associated with. To disassociate an Elastic IP address without releasing it, use DisassociateAddress.


   [Nondefault VPC] You must use DisassociateAddress to disassociate the Elastic IP address before you can
   release it. Otherwise, Amazon EC2 returns an error (InvalidIPAddress.InUse).


   After releasing an Elastic IP address, it is released to the IP address pool. Be sure to update your DNS records
   and any servers or devices that communicate with the address. If you attempt to release an Elastic IP address
   that you already released, you'll get an AuthFailure error if the address is already allocated to
   another AWS account.


   [EC2-VPC] After you release an Elastic IP address for use in a VPC, you might be able to recover it. For more
   information, see AllocateAddress.

  release-address-request - `com.amazonaws.services.ec2.model.ReleaseAddressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReleaseAddress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ReleaseAddressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ReleaseAddressRequest release-address-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.releaseAddressAsync release-address-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ReleaseAddressRequest release-address-request]
    (-> this (.releaseAddressAsync release-address-request))))

(defn describe-image-attribute-async
  "Describes the specified attribute of the specified AMI. You can specify only one attribute at a time.

  describe-image-attribute-request - Contains the parameters for DescribeImageAttribute. - `com.amazonaws.services.ec2.model.DescribeImageAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeImageAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeImageAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeImageAttributeRequest describe-image-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeImageAttributeAsync describe-image-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeImageAttributeRequest describe-image-attribute-request]
    (-> this (.describeImageAttributeAsync describe-image-attribute-request))))

(defn modify-traffic-mirror-filter-network-services-async
  "Allows or restricts mirroring network services.


   By default, Amazon DNS network services are not eligible for Traffic Mirror. Use AddNetworkServices
   to add network services to a Traffic Mirror filter. When a network service is added to the Traffic Mirror filter,
   all traffic related to that network service will be mirrored. When you no longer want to mirror network services,
   use RemoveNetworkServices to remove the network services from the Traffic Mirror filter.


   FFor information about filter rule properties, see Network Services in the Traffic Mirroring User Guide .

  modify-traffic-mirror-filter-network-services-request - `com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterNetworkServicesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyTrafficMirrorFilterNetworkServices operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterNetworkServicesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterNetworkServicesRequest modify-traffic-mirror-filter-network-services-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyTrafficMirrorFilterNetworkServicesAsync modify-traffic-mirror-filter-network-services-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterNetworkServicesRequest modify-traffic-mirror-filter-network-services-request]
    (-> this (.modifyTrafficMirrorFilterNetworkServicesAsync modify-traffic-mirror-filter-network-services-request))))

(defn delete-traffic-mirror-filter-async
  "Deletes the specified Traffic Mirror filter.


   You cannot delete a Traffic Mirror filter that is in use by a Traffic Mirror session.

  delete-traffic-mirror-filter-request - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTrafficMirrorFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRequest delete-traffic-mirror-filter-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTrafficMirrorFilterAsync delete-traffic-mirror-filter-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRequest delete-traffic-mirror-filter-request]
    (-> this (.deleteTrafficMirrorFilterAsync delete-traffic-mirror-filter-request))))

(defn move-address-to-vpc-async
  "Moves an Elastic IP address from the EC2-Classic platform to the EC2-VPC platform. The Elastic IP address must be
   allocated to your account for more than 24 hours, and it must not be associated with an instance. After the
   Elastic IP address is moved, it is no longer available for use in the EC2-Classic platform, unless you move it
   back using the RestoreAddressToClassic request. You cannot move an Elastic IP address that was originally
   allocated for use in the EC2-VPC platform to the EC2-Classic platform.

  move-address-to-vpc-request - `com.amazonaws.services.ec2.model.MoveAddressToVpcRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MoveAddressToVpc operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.MoveAddressToVpcResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.MoveAddressToVpcRequest move-address-to-vpc-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.moveAddressToVpcAsync move-address-to-vpc-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.MoveAddressToVpcRequest move-address-to-vpc-request]
    (-> this (.moveAddressToVpcAsync move-address-to-vpc-request))))

(defn describe-import-image-tasks-async
  "Displays details about an import virtual machine or import snapshot tasks that are already created.

  describe-import-image-tasks-request - `com.amazonaws.services.ec2.model.DescribeImportImageTasksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeImportImageTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeImportImageTasksResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeImportImageTasksRequest describe-import-image-tasks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeImportImageTasksAsync describe-import-image-tasks-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeImportImageTasksRequest describe-import-image-tasks-request]
    (-> this (.describeImportImageTasksAsync describe-import-image-tasks-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeImportImageTasksAsync))))

(defn describe-network-interfaces-async
  "Describes one or more of your network interfaces.

  describe-network-interfaces-request - Contains the parameters for DescribeNetworkInterfaces. - `com.amazonaws.services.ec2.model.DescribeNetworkInterfacesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNetworkInterfaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeNetworkInterfacesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeNetworkInterfacesRequest describe-network-interfaces-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNetworkInterfacesAsync describe-network-interfaces-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeNetworkInterfacesRequest describe-network-interfaces-request]
    (-> this (.describeNetworkInterfacesAsync describe-network-interfaces-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeNetworkInterfacesAsync))))

(defn modify-instance-event-start-time-async
  "Modifies the start time for a scheduled Amazon EC2 instance event.

  modify-instance-event-start-time-request - `com.amazonaws.services.ec2.model.ModifyInstanceEventStartTimeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyInstanceEventStartTime operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyInstanceEventStartTimeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyInstanceEventStartTimeRequest modify-instance-event-start-time-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyInstanceEventStartTimeAsync modify-instance-event-start-time-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyInstanceEventStartTimeRequest modify-instance-event-start-time-request]
    (-> this (.modifyInstanceEventStartTimeAsync modify-instance-event-start-time-request))))

(defn cancel-spot-fleet-requests-async
  "Cancels the specified Spot Fleet requests.


   After you cancel a Spot Fleet request, the Spot Fleet launches no new Spot Instances. You must specify whether
   the Spot Fleet should also terminate its Spot Instances. If you terminate the instances, the Spot Fleet request
   enters the cancelled_terminating state. Otherwise, the Spot Fleet request enters the
   cancelled_running state and the instances continue to run until they are interrupted or you
   terminate them manually.

  cancel-spot-fleet-requests-request - Contains the parameters for CancelSpotFleetRequests. - `com.amazonaws.services.ec2.model.CancelSpotFleetRequestsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelSpotFleetRequests operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CancelSpotFleetRequestsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CancelSpotFleetRequestsRequest cancel-spot-fleet-requests-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelSpotFleetRequestsAsync cancel-spot-fleet-requests-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CancelSpotFleetRequestsRequest cancel-spot-fleet-requests-request]
    (-> this (.cancelSpotFleetRequestsAsync cancel-spot-fleet-requests-request))))

(defn disassociate-transit-gateway-route-table-async
  "Disassociates a resource attachment from a transit gateway route table.

  disassociate-transit-gateway-route-table-request - `com.amazonaws.services.ec2.model.DisassociateTransitGatewayRouteTableRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateTransitGatewayRouteTable operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisassociateTransitGatewayRouteTableResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisassociateTransitGatewayRouteTableRequest disassociate-transit-gateway-route-table-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateTransitGatewayRouteTableAsync disassociate-transit-gateway-route-table-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisassociateTransitGatewayRouteTableRequest disassociate-transit-gateway-route-table-request]
    (-> this (.disassociateTransitGatewayRouteTableAsync disassociate-transit-gateway-route-table-request))))

(defn create-transit-gateway-async
  "Creates a transit gateway.


   You can use a transit gateway to interconnect your virtual private clouds (VPC) and on-premises networks. After
   the transit gateway enters the available state, you can attach your VPCs and VPN connections to the
   transit gateway.


   To attach your VPCs, use CreateTransitGatewayVpcAttachment.


   To attach a VPN connection, use CreateCustomerGateway to create a customer gateway and specify the ID of
   the customer gateway and the ID of the transit gateway in a call to CreateVpnConnection.


   When you create a transit gateway, we create a default transit gateway route table and use it as the default
   association route table and the default propagation route table. You can use
   CreateTransitGatewayRouteTable to create additional transit gateway route tables. If you disable automatic
   route propagation, we do not create a default transit gateway route table. You can use
   EnableTransitGatewayRouteTablePropagation to propagate routes from a resource attachment to a transit
   gateway route table. If you disable automatic associations, you can use AssociateTransitGatewayRouteTable
   to associate a resource attachment with a transit gateway route table.

  create-transit-gateway-request - `com.amazonaws.services.ec2.model.CreateTransitGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTransitGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateTransitGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateTransitGatewayRequest create-transit-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTransitGatewayAsync create-transit-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateTransitGatewayRequest create-transit-gateway-request]
    (-> this (.createTransitGatewayAsync create-transit-gateway-request))))

(defn create-capacity-reservation-async
  "Creates a new Capacity Reservation with the specified attributes.


   Capacity Reservations enable you to reserve capacity for your Amazon EC2 instances in a specific Availability
   Zone for any duration. This gives you the flexibility to selectively add capacity reservations and still get the
   Regional RI discounts for that usage. By creating Capacity Reservations, you ensure that you always have access
   to Amazon EC2 capacity when you need it, for as long as you need it. For more information, see Capacity
   Reservations in the Amazon Elastic Compute Cloud User Guide.


   Your request to create a Capacity Reservation could fail if Amazon EC2 does not have sufficient capacity to
   fulfill the request. If your request fails due to Amazon EC2 capacity constraints, either try again at a later
   time, try in a different Availability Zone, or request a smaller capacity reservation. If your application is
   flexible across instance types and sizes, try to create a Capacity Reservation with different instance
   attributes.


   Your request could also fail if the requested quantity exceeds your On-Demand Instance limit for the selected
   instance type. If your request fails due to limit constraints, increase your On-Demand Instance limit for the
   required instance type and try again. For more information about increasing your instance limits, see Amazon EC2 Service Limits
   in the Amazon Elastic Compute Cloud User Guide.

  create-capacity-reservation-request - `com.amazonaws.services.ec2.model.CreateCapacityReservationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCapacityReservation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateCapacityReservationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateCapacityReservationRequest create-capacity-reservation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCapacityReservationAsync create-capacity-reservation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateCapacityReservationRequest create-capacity-reservation-request]
    (-> this (.createCapacityReservationAsync create-capacity-reservation-request))))

(defn get-capacity-reservation-usage-async
  "get-capacity-reservation-usage-request - `com.amazonaws.services.ec2.model.GetCapacityReservationUsageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCapacityReservationUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetCapacityReservationUsageResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetCapacityReservationUsageRequest get-capacity-reservation-usage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCapacityReservationUsageAsync get-capacity-reservation-usage-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetCapacityReservationUsageRequest get-capacity-reservation-usage-request]
    (-> this (.getCapacityReservationUsageAsync get-capacity-reservation-usage-request))))

(defn describe-conversion-tasks-async
  "Describes the specified conversion tasks or all your conversion tasks. For more information, see the VM Import/Export User Guide.


   For information about the import manifest referenced by this API action, see VM Import Manifest.

  describe-conversion-tasks-request - `com.amazonaws.services.ec2.model.DescribeConversionTasksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConversionTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeConversionTasksResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeConversionTasksRequest describe-conversion-tasks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConversionTasksAsync describe-conversion-tasks-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeConversionTasksRequest describe-conversion-tasks-request]
    (-> this (.describeConversionTasksAsync describe-conversion-tasks-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeConversionTasksAsync))))

(defn request-spot-instances-async
  "Creates a Spot Instance request.


   For more information, see Spot
   Instance Requests in the Amazon EC2 User Guide for Linux Instances.

  request-spot-instances-request - Contains the parameters for RequestSpotInstances. - `com.amazonaws.services.ec2.model.RequestSpotInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RequestSpotInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RequestSpotInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RequestSpotInstancesRequest request-spot-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.requestSpotInstancesAsync request-spot-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RequestSpotInstancesRequest request-spot-instances-request]
    (-> this (.requestSpotInstancesAsync request-spot-instances-request))))

(defn delete-client-vpn-endpoint-async
  "Deletes the specified Client VPN endpoint. You must disassociate all target networks before you can delete a
   Client VPN endpoint.

  delete-client-vpn-endpoint-request - `com.amazonaws.services.ec2.model.DeleteClientVpnEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteClientVpnEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteClientVpnEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteClientVpnEndpointRequest delete-client-vpn-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClientVpnEndpointAsync delete-client-vpn-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteClientVpnEndpointRequest delete-client-vpn-endpoint-request]
    (-> this (.deleteClientVpnEndpointAsync delete-client-vpn-endpoint-request))))

(defn modify-volume-attribute-async
  "Modifies a volume attribute.


   By default, all I/O operations for the volume are suspended when the data on the volume is determined to be
   potentially inconsistent, to prevent undetectable, latent data corruption. The I/O access to the volume can be
   resumed by first enabling I/O access and then checking the data consistency on your volume.


   You can change the default behavior to resume I/O operations. We recommend that you change this only for boot
   volumes or for volumes that are stateless or disposable.

  modify-volume-attribute-request - Contains the parameters for ModifyVolumeAttribute. - `com.amazonaws.services.ec2.model.ModifyVolumeAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyVolumeAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyVolumeAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyVolumeAttributeRequest modify-volume-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyVolumeAttributeAsync modify-volume-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyVolumeAttributeRequest modify-volume-attribute-request]
    (-> this (.modifyVolumeAttributeAsync modify-volume-attribute-request))))

(defn modify-transit-gateway-vpc-attachment-async
  "Modifies the specified VPC attachment.

  modify-transit-gateway-vpc-attachment-request - `com.amazonaws.services.ec2.model.ModifyTransitGatewayVpcAttachmentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyTransitGatewayVpcAttachment operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyTransitGatewayVpcAttachmentResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyTransitGatewayVpcAttachmentRequest modify-transit-gateway-vpc-attachment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyTransitGatewayVpcAttachmentAsync modify-transit-gateway-vpc-attachment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyTransitGatewayVpcAttachmentRequest modify-transit-gateway-vpc-attachment-request]
    (-> this (.modifyTransitGatewayVpcAttachmentAsync modify-transit-gateway-vpc-attachment-request))))

(defn advertise-byoip-cidr-async
  "Advertises an IPv4 address range that is provisioned for use with your AWS resources through bring your own IP
   addresses (BYOIP).


   You can perform this operation at most once every 10 seconds, even if you specify different address ranges each
   time.


   We recommend that you stop advertising the BYOIP CIDR from other locations when you advertise it from AWS. To
   minimize down time, you can configure your AWS resources to use an address from a BYOIP CIDR before it is
   advertised, and then simultaneously stop advertising it from the current location and start advertising it
   through AWS.


   It can take a few minutes before traffic to the specified addresses starts routing to AWS because of BGP
   propagation delays.


   To stop advertising the BYOIP CIDR, use WithdrawByoipCidr.

  advertise-byoip-cidr-request - `com.amazonaws.services.ec2.model.AdvertiseByoipCidrRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdvertiseByoipCidr operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AdvertiseByoipCidrResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AdvertiseByoipCidrRequest advertise-byoip-cidr-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.advertiseByoipCidrAsync advertise-byoip-cidr-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AdvertiseByoipCidrRequest advertise-byoip-cidr-request]
    (-> this (.advertiseByoipCidrAsync advertise-byoip-cidr-request))))

(defn associate-dhcp-options-async
  "Associates a set of DHCP options (that you've previously created) with the specified VPC, or associates no DHCP
   options with the VPC.


   After you associate the options with the VPC, any existing instances and all new instances that you launch in
   that VPC use the options. You don't need to restart or relaunch the instances. They automatically pick up the
   changes within a few hours, depending on how frequently the instance renews its DHCP lease. You can explicitly
   renew the lease using the operating system on the instance.


   For more information, see DHCP
   Options Sets in the Amazon Virtual Private Cloud User Guide.

  associate-dhcp-options-request - `com.amazonaws.services.ec2.model.AssociateDhcpOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateDhcpOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AssociateDhcpOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AssociateDhcpOptionsRequest associate-dhcp-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateDhcpOptionsAsync associate-dhcp-options-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AssociateDhcpOptionsRequest associate-dhcp-options-request]
    (-> this (.associateDhcpOptionsAsync associate-dhcp-options-request))))

(defn create-default-vpc-async
  "Creates a default VPC with a size /16 IPv4 CIDR block and a default subnet in each Availability
   Zone. For more information about the components of a default VPC, see Default VPC and Default Subnets in
   the Amazon Virtual Private Cloud User Guide. You cannot specify the components of the default VPC
   yourself.


   If you deleted your previous default VPC, you can create a default VPC. You cannot have more than one default VPC
   per Region.


   If your account supports EC2-Classic, you cannot use this action to create a default VPC in a Region that
   supports EC2-Classic. If you want a default VPC in a Region that supports EC2-Classic, see
   \"I really want a default VPC for my existing EC2 account. Is that possible?\" in the Default VPCs FAQ.

  create-default-vpc-request - `com.amazonaws.services.ec2.model.CreateDefaultVpcRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDefaultVpc operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateDefaultVpcResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateDefaultVpcRequest create-default-vpc-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDefaultVpcAsync create-default-vpc-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateDefaultVpcRequest create-default-vpc-request]
    (-> this (.createDefaultVpcAsync create-default-vpc-request))))

(defn describe-reserved-instances-async
  "Describes one or more of the Reserved Instances that you purchased.


   For more information about Reserved Instances, see Reserved
   Instances in the Amazon Elastic Compute Cloud User Guide.

  describe-reserved-instances-request - Contains the parameters for DescribeReservedInstances. - `com.amazonaws.services.ec2.model.DescribeReservedInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeReservedInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesRequest describe-reserved-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedInstancesAsync describe-reserved-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesRequest describe-reserved-instances-request]
    (-> this (.describeReservedInstancesAsync describe-reserved-instances-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeReservedInstancesAsync))))

(defn reject-transit-gateway-vpc-attachment-async
  "Rejects a request to attach a VPC to a transit gateway.


   The VPC attachment must be in the pendingAcceptance state. Use
   DescribeTransitGatewayVpcAttachments to view your pending VPC attachment requests. Use
   AcceptTransitGatewayVpcAttachment to accept a VPC attachment request.

  reject-transit-gateway-vpc-attachment-request - `com.amazonaws.services.ec2.model.RejectTransitGatewayVpcAttachmentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RejectTransitGatewayVpcAttachment operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RejectTransitGatewayVpcAttachmentResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RejectTransitGatewayVpcAttachmentRequest reject-transit-gateway-vpc-attachment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rejectTransitGatewayVpcAttachmentAsync reject-transit-gateway-vpc-attachment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RejectTransitGatewayVpcAttachmentRequest reject-transit-gateway-vpc-attachment-request]
    (-> this (.rejectTransitGatewayVpcAttachmentAsync reject-transit-gateway-vpc-attachment-request))))

(defn describe-flow-logs-async
  "Describes one or more flow logs. To view the information in your flow logs (the log streams for the network
   interfaces), you must use the CloudWatch Logs console or the CloudWatch Logs API.

  describe-flow-logs-request - `com.amazonaws.services.ec2.model.DescribeFlowLogsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFlowLogs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeFlowLogsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeFlowLogsRequest describe-flow-logs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFlowLogsAsync describe-flow-logs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeFlowLogsRequest describe-flow-logs-request]
    (-> this (.describeFlowLogsAsync describe-flow-logs-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeFlowLogsAsync))))

(defn create-flow-logs-async
  "Creates one or more flow logs to capture information about IP traffic for a specific network interface, subnet,
   or VPC.


   Flow log data for a monitored network interface is recorded as flow log records, which are log events consisting
   of fields that describe the traffic flow. For more information, see Flow Log Records in
   the Amazon Virtual Private Cloud User Guide.


   When publishing to CloudWatch Logs, flow log records are published to a log group, and each network interface has
   a unique log stream in the log group. When publishing to Amazon S3, flow log records for all of the monitored
   network interfaces are published to a single log file object that is stored in the specified bucket.


   For more information, see VPC Flow
   Logs in the Amazon Virtual Private Cloud User Guide.

  create-flow-logs-request - `com.amazonaws.services.ec2.model.CreateFlowLogsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFlowLogs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateFlowLogsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateFlowLogsRequest create-flow-logs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFlowLogsAsync create-flow-logs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateFlowLogsRequest create-flow-logs-request]
    (-> this (.createFlowLogsAsync create-flow-logs-request))))

(defn disassociate-route-table-async
  "Disassociates a subnet from a route table.


   After you perform this action, the subnet no longer uses the routes in the route table. Instead, it uses the
   routes in the VPC's main route table. For more information about route tables, see Route Tables in the Amazon
   Virtual Private Cloud User Guide.

  disassociate-route-table-request - `com.amazonaws.services.ec2.model.DisassociateRouteTableRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateRouteTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisassociateRouteTableResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisassociateRouteTableRequest disassociate-route-table-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateRouteTableAsync disassociate-route-table-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisassociateRouteTableRequest disassociate-route-table-request]
    (-> this (.disassociateRouteTableAsync disassociate-route-table-request))))

(defn replace-iam-instance-profile-association-async
  "Replaces an IAM instance profile for the specified running instance. You can use this action to change the IAM
   instance profile that's associated with an instance without having to disassociate the existing IAM instance
   profile first.


   Use DescribeIamInstanceProfileAssociations to get the association ID.

  replace-iam-instance-profile-association-request - `com.amazonaws.services.ec2.model.ReplaceIamInstanceProfileAssociationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReplaceIamInstanceProfileAssociation operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ReplaceIamInstanceProfileAssociationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ReplaceIamInstanceProfileAssociationRequest replace-iam-instance-profile-association-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.replaceIamInstanceProfileAssociationAsync replace-iam-instance-profile-association-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ReplaceIamInstanceProfileAssociationRequest replace-iam-instance-profile-association-request]
    (-> this (.replaceIamInstanceProfileAssociationAsync replace-iam-instance-profile-association-request))))

(defn update-security-group-rule-descriptions-egress-async
  "[VPC only] Updates the description of an egress (outbound) security group rule. You can replace an existing
   description, or add a description to a rule that did not have one previously.


   You specify the description as part of the IP permissions structure. You can remove a description for a security
   group rule by omitting the description parameter in the request.

  update-security-group-rule-descriptions-egress-request - `com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsEgressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSecurityGroupRuleDescriptionsEgress operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsEgressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsEgressRequest update-security-group-rule-descriptions-egress-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSecurityGroupRuleDescriptionsEgressAsync update-security-group-rule-descriptions-egress-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsEgressRequest update-security-group-rule-descriptions-egress-request]
    (-> this (.updateSecurityGroupRuleDescriptionsEgressAsync update-security-group-rule-descriptions-egress-request))))

(defn create-egress-only-internet-gateway-async
  "[IPv6 only] Creates an egress-only internet gateway for your VPC. An egress-only internet gateway is used to
   enable outbound communication over IPv6 from instances in your VPC to the internet, and prevents hosts outside of
   your VPC from initiating an IPv6 connection with your instance.

  create-egress-only-internet-gateway-request - `com.amazonaws.services.ec2.model.CreateEgressOnlyInternetGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEgressOnlyInternetGateway operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateEgressOnlyInternetGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateEgressOnlyInternetGatewayRequest create-egress-only-internet-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEgressOnlyInternetGatewayAsync create-egress-only-internet-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateEgressOnlyInternetGatewayRequest create-egress-only-internet-gateway-request]
    (-> this (.createEgressOnlyInternetGatewayAsync create-egress-only-internet-gateway-request))))

(defn delete-transit-gateway-async
  "Deletes the specified transit gateway.

  delete-transit-gateway-request - `com.amazonaws.services.ec2.model.DeleteTransitGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTransitGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteTransitGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayRequest delete-transit-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTransitGatewayAsync delete-transit-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayRequest delete-transit-gateway-request]
    (-> this (.deleteTransitGatewayAsync delete-transit-gateway-request))))

(defn disable-ebs-encryption-by-default-async
  "Disables EBS encryption by default for your account in the current Region.


   After you disable encryption by default, you can still create encrypted volumes by enabling encryption when you
   create each volume.


   Disabling encryption by default does not change the encryption status of your existing volumes.


   For more information, see Amazon
   EBS Encryption in the Amazon Elastic Compute Cloud User Guide.

  disable-ebs-encryption-by-default-request - `com.amazonaws.services.ec2.model.DisableEbsEncryptionByDefaultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableEbsEncryptionByDefault operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisableEbsEncryptionByDefaultResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisableEbsEncryptionByDefaultRequest disable-ebs-encryption-by-default-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableEbsEncryptionByDefaultAsync disable-ebs-encryption-by-default-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisableEbsEncryptionByDefaultRequest disable-ebs-encryption-by-default-request]
    (-> this (.disableEbsEncryptionByDefaultAsync disable-ebs-encryption-by-default-request))))

(defn modify-vpc-endpoint-service-configuration-async
  "Modifies the attributes of your VPC endpoint service configuration. You can change the Network Load Balancers for
   your service, and you can specify whether acceptance is required for requests to connect to your endpoint service
   through an interface VPC endpoint.

  modify-vpc-endpoint-service-configuration-request - `com.amazonaws.services.ec2.model.ModifyVpcEndpointServiceConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyVpcEndpointServiceConfiguration operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyVpcEndpointServiceConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointServiceConfigurationRequest modify-vpc-endpoint-service-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyVpcEndpointServiceConfigurationAsync modify-vpc-endpoint-service-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointServiceConfigurationRequest modify-vpc-endpoint-service-configuration-request]
    (-> this (.modifyVpcEndpointServiceConfigurationAsync modify-vpc-endpoint-service-configuration-request))))

(defn describe-placement-groups-async
  "Describes the specified placement groups or all of your placement groups. For more information, see Placement Groups in the
   Amazon Elastic Compute Cloud User Guide.

  describe-placement-groups-request - `com.amazonaws.services.ec2.model.DescribePlacementGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePlacementGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribePlacementGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribePlacementGroupsRequest describe-placement-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePlacementGroupsAsync describe-placement-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribePlacementGroupsRequest describe-placement-groups-request]
    (-> this (.describePlacementGroupsAsync describe-placement-groups-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describePlacementGroupsAsync))))

(defn delete-key-pair-async
  "Deletes the specified key pair, by removing the public key from Amazon EC2.

  delete-key-pair-request - `com.amazonaws.services.ec2.model.DeleteKeyPairRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteKeyPair operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteKeyPairResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteKeyPairRequest delete-key-pair-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteKeyPairAsync delete-key-pair-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteKeyPairRequest delete-key-pair-request]
    (-> this (.deleteKeyPairAsync delete-key-pair-request))))

(defn cancel-reserved-instances-listing-async
  "Cancels the specified Reserved Instance listing in the Reserved Instance Marketplace.


   For more information, see Reserved Instance
   Marketplace in the Amazon Elastic Compute Cloud User Guide.

  cancel-reserved-instances-listing-request - Contains the parameters for CancelReservedInstancesListing. - `com.amazonaws.services.ec2.model.CancelReservedInstancesListingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelReservedInstancesListing operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CancelReservedInstancesListingResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CancelReservedInstancesListingRequest cancel-reserved-instances-listing-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelReservedInstancesListingAsync cancel-reserved-instances-listing-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CancelReservedInstancesListingRequest cancel-reserved-instances-listing-request]
    (-> this (.cancelReservedInstancesListingAsync cancel-reserved-instances-listing-request))))

(defn create-customer-gateway-async
  "Provides information to AWS about your VPN customer gateway device. The customer gateway is the appliance at your
   end of the VPN connection. (The device on the AWS side of the VPN connection is the virtual private gateway.) You
   must provide the Internet-routable IP address of the customer gateway's external interface. The IP address must
   be static and may be behind a device performing network address translation (NAT).


   For devices that use Border Gateway Protocol (BGP), you can also provide the device's BGP Autonomous System
   Number (ASN). You can use an existing ASN assigned to your network. If you don't have an ASN already, you can use
   a private ASN (in the 64512 - 65534 range).



   Amazon EC2 supports all 2-byte ASN numbers in the range of 1 - 65534, with the exception of 7224, which is
   reserved in the us-east-1 Region, and 9059, which is reserved in the eu-west-1 Region.



   For more information, see AWS Site-to-Site
   VPN in the AWS Site-to-Site VPN User Guide.



   You cannot create more than one customer gateway with the same VPN type, IP address, and BGP ASN parameter
   values. If you run an identical request more than one time, the first request creates the customer gateway, and
   subsequent requests return information about the existing customer gateway. The subsequent requests do not create
   new customer gateway resources.

  create-customer-gateway-request - Contains the parameters for CreateCustomerGateway. - `com.amazonaws.services.ec2.model.CreateCustomerGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCustomerGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateCustomerGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateCustomerGatewayRequest create-customer-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCustomerGatewayAsync create-customer-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateCustomerGatewayRequest create-customer-gateway-request]
    (-> this (.createCustomerGatewayAsync create-customer-gateway-request))))

(defn describe-import-snapshot-tasks-async
  "Describes your import snapshot tasks.

  describe-import-snapshot-tasks-request - `com.amazonaws.services.ec2.model.DescribeImportSnapshotTasksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeImportSnapshotTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeImportSnapshotTasksResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeImportSnapshotTasksRequest describe-import-snapshot-tasks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeImportSnapshotTasksAsync describe-import-snapshot-tasks-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeImportSnapshotTasksRequest describe-import-snapshot-tasks-request]
    (-> this (.describeImportSnapshotTasksAsync describe-import-snapshot-tasks-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeImportSnapshotTasksAsync))))

(defn describe-spot-datafeed-subscription-async
  "Describes the data feed for Spot Instances. For more information, see Spot Instance Data Feed in
   the Amazon EC2 User Guide for Linux Instances.

  describe-spot-datafeed-subscription-request - Contains the parameters for DescribeSpotDatafeedSubscription. - `com.amazonaws.services.ec2.model.DescribeSpotDatafeedSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSpotDatafeedSubscription operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeSpotDatafeedSubscriptionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeSpotDatafeedSubscriptionRequest describe-spot-datafeed-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSpotDatafeedSubscriptionAsync describe-spot-datafeed-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeSpotDatafeedSubscriptionRequest describe-spot-datafeed-subscription-request]
    (-> this (.describeSpotDatafeedSubscriptionAsync describe-spot-datafeed-subscription-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeSpotDatafeedSubscriptionAsync))))

(defn attach-vpn-gateway-async
  "Attaches a virtual private gateway to a VPC. You can attach one virtual private gateway to one VPC at a time.


   For more information, see AWS Site-to-Site
   VPN in the AWS Site-to-Site VPN User Guide.

  attach-vpn-gateway-request - Contains the parameters for AttachVpnGateway. - `com.amazonaws.services.ec2.model.AttachVpnGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachVpnGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AttachVpnGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AttachVpnGatewayRequest attach-vpn-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachVpnGatewayAsync attach-vpn-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AttachVpnGatewayRequest attach-vpn-gateway-request]
    (-> this (.attachVpnGatewayAsync attach-vpn-gateway-request))))

(defn modify-vpc-endpoint-connection-notification-async
  "Modifies a connection notification for VPC endpoint or VPC endpoint service. You can change the SNS topic for the
   notification, or the events for which to be notified.

  modify-vpc-endpoint-connection-notification-request - `com.amazonaws.services.ec2.model.ModifyVpcEndpointConnectionNotificationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyVpcEndpointConnectionNotification operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyVpcEndpointConnectionNotificationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointConnectionNotificationRequest modify-vpc-endpoint-connection-notification-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyVpcEndpointConnectionNotificationAsync modify-vpc-endpoint-connection-notification-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointConnectionNotificationRequest modify-vpc-endpoint-connection-notification-request]
    (-> this (.modifyVpcEndpointConnectionNotificationAsync modify-vpc-endpoint-connection-notification-request))))

(defn create-client-vpn-endpoint-async
  "Creates a Client VPN endpoint. A Client VPN endpoint is the resource you create and configure to enable and
   manage client VPN sessions. It is the destination endpoint at which all client VPN sessions are terminated.

  create-client-vpn-endpoint-request - `com.amazonaws.services.ec2.model.CreateClientVpnEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateClientVpnEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateClientVpnEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateClientVpnEndpointRequest create-client-vpn-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClientVpnEndpointAsync create-client-vpn-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateClientVpnEndpointRequest create-client-vpn-endpoint-request]
    (-> this (.createClientVpnEndpointAsync create-client-vpn-endpoint-request))))

(defn describe-launch-template-versions-async
  "Describes one or more versions of a specified launch template. You can describe all versions, individual
   versions, or a range of versions.

  describe-launch-template-versions-request - `com.amazonaws.services.ec2.model.DescribeLaunchTemplateVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLaunchTemplateVersions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeLaunchTemplateVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeLaunchTemplateVersionsRequest describe-launch-template-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLaunchTemplateVersionsAsync describe-launch-template-versions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeLaunchTemplateVersionsRequest describe-launch-template-versions-request]
    (-> this (.describeLaunchTemplateVersionsAsync describe-launch-template-versions-request))))

(defn describe-fleet-instances-async
  "Describes the running instances for the specified EC2 Fleet.

  describe-fleet-instances-request - `com.amazonaws.services.ec2.model.DescribeFleetInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFleetInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeFleetInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeFleetInstancesRequest describe-fleet-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFleetInstancesAsync describe-fleet-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeFleetInstancesRequest describe-fleet-instances-request]
    (-> this (.describeFleetInstancesAsync describe-fleet-instances-request))))

(defn describe-regions-async
  "Describes the Regions that are enabled for your account, or all Regions.


   For a list of the Regions supported by Amazon EC2, see  Regions and Endpoints.


   For information about enabling and disabling Regions for your account, see Managing AWS Regions in the AWS
   General Reference.

  describe-regions-request - `com.amazonaws.services.ec2.model.DescribeRegionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRegions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeRegionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeRegionsRequest describe-regions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRegionsAsync describe-regions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeRegionsRequest describe-regions-request]
    (-> this (.describeRegionsAsync describe-regions-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeRegionsAsync))))

(defn describe-fpga-image-attribute-async
  "Describes the specified attribute of the specified Amazon FPGA Image (AFI).

  describe-fpga-image-attribute-request - `com.amazonaws.services.ec2.model.DescribeFpgaImageAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFpgaImageAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeFpgaImageAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeFpgaImageAttributeRequest describe-fpga-image-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFpgaImageAttributeAsync describe-fpga-image-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeFpgaImageAttributeRequest describe-fpga-image-attribute-request]
    (-> this (.describeFpgaImageAttributeAsync describe-fpga-image-attribute-request))))

(defn modify-capacity-reservation-async
  "Modifies a Capacity Reservation's capacity and the conditions under which it is to be released. You cannot change
   a Capacity Reservation's instance type, EBS optimization, instance store settings, platform, Availability Zone,
   or instance eligibility. If you need to modify any of these attributes, we recommend that you cancel the Capacity
   Reservation, and then create a new one with the required attributes.

  modify-capacity-reservation-request - `com.amazonaws.services.ec2.model.ModifyCapacityReservationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyCapacityReservation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyCapacityReservationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyCapacityReservationRequest modify-capacity-reservation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyCapacityReservationAsync modify-capacity-reservation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyCapacityReservationRequest modify-capacity-reservation-request]
    (-> this (.modifyCapacityReservationAsync modify-capacity-reservation-request))))

(defn export-client-vpn-client-certificate-revocation-list-async
  "Downloads the client certificate revocation list for the specified Client VPN endpoint.

  export-client-vpn-client-certificate-revocation-list-request - `com.amazonaws.services.ec2.model.ExportClientVpnClientCertificateRevocationListRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExportClientVpnClientCertificateRevocationList operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ExportClientVpnClientCertificateRevocationListResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ExportClientVpnClientCertificateRevocationListRequest export-client-vpn-client-certificate-revocation-list-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.exportClientVpnClientCertificateRevocationListAsync export-client-vpn-client-certificate-revocation-list-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ExportClientVpnClientCertificateRevocationListRequest export-client-vpn-client-certificate-revocation-list-request]
    (-> this (.exportClientVpnClientCertificateRevocationListAsync export-client-vpn-client-certificate-revocation-list-request))))

(defn authorize-security-group-egress-async
  "[VPC only] Adds the specified egress rules to a security group for use with a VPC.


   An outbound rule permits instances to send traffic to the specified IPv4 or IPv6 CIDR address ranges, or to the
   instances associated with the specified destination security groups.


   You specify a protocol for each rule (for example, TCP). For the TCP and UDP protocols, you must also specify the
   destination port or port range. For the ICMP protocol, you must also specify the ICMP type and code. You can use
   -1 for the type or code to mean all types or all codes.


   Rule changes are propagated to affected instances as quickly as possible. However, a small delay might occur.


   For more information about VPC security group limits, see Amazon VPC Limits.

  authorize-security-group-egress-request - `com.amazonaws.services.ec2.model.AuthorizeSecurityGroupEgressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AuthorizeSecurityGroupEgress operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AuthorizeSecurityGroupEgressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AuthorizeSecurityGroupEgressRequest authorize-security-group-egress-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.authorizeSecurityGroupEgressAsync authorize-security-group-egress-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AuthorizeSecurityGroupEgressRequest authorize-security-group-egress-request]
    (-> this (.authorizeSecurityGroupEgressAsync authorize-security-group-egress-request))))

(defn delete-security-group-async
  "Deletes a security group.


   If you attempt to delete a security group that is associated with an instance, or is referenced by another
   security group, the operation fails with InvalidGroup.InUse in EC2-Classic or
   DependencyViolation in EC2-VPC.

  delete-security-group-request - `com.amazonaws.services.ec2.model.DeleteSecurityGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteSecurityGroupResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteSecurityGroupRequest delete-security-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSecurityGroupAsync delete-security-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteSecurityGroupRequest delete-security-group-request]
    (-> this (.deleteSecurityGroupAsync delete-security-group-request))))

(defn disassociate-address-async
  "Disassociates an Elastic IP address from the instance or network interface it's associated with.


   An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see Elastic IP Addresses
   in the Amazon Elastic Compute Cloud User Guide.


   This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error.

  disassociate-address-request - `com.amazonaws.services.ec2.model.DisassociateAddressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateAddress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisassociateAddressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisassociateAddressRequest disassociate-address-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateAddressAsync disassociate-address-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisassociateAddressRequest disassociate-address-request]
    (-> this (.disassociateAddressAsync disassociate-address-request))))

(defn delete-vpc-endpoint-service-configurations-async
  "Deletes one or more VPC endpoint service configurations in your account. Before you delete the endpoint service
   configuration, you must reject any Available or PendingAcceptance interface endpoint
   connections that are attached to the service.

  delete-vpc-endpoint-service-configurations-request - `com.amazonaws.services.ec2.model.DeleteVpcEndpointServiceConfigurationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVpcEndpointServiceConfigurations operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteVpcEndpointServiceConfigurationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteVpcEndpointServiceConfigurationsRequest delete-vpc-endpoint-service-configurations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVpcEndpointServiceConfigurationsAsync delete-vpc-endpoint-service-configurations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteVpcEndpointServiceConfigurationsRequest delete-vpc-endpoint-service-configurations-request]
    (-> this (.deleteVpcEndpointServiceConfigurationsAsync delete-vpc-endpoint-service-configurations-request))))

(defn modify-reserved-instances-async
  "Modifies the Availability Zone, instance count, instance type, or network platform (EC2-Classic or EC2-VPC) of
   your Reserved Instances. The Reserved Instances to be modified must be identical, except for Availability Zone,
   network platform, and instance type.


   For more information, see Modifying Reserved Instances in
   the Amazon Elastic Compute Cloud User Guide.

  modify-reserved-instances-request - Contains the parameters for ModifyReservedInstances. - `com.amazonaws.services.ec2.model.ModifyReservedInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyReservedInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyReservedInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyReservedInstancesRequest modify-reserved-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyReservedInstancesAsync modify-reserved-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyReservedInstancesRequest modify-reserved-instances-request]
    (-> this (.modifyReservedInstancesAsync modify-reserved-instances-request))))

(defn associate-vpc-cidr-block-async
  "Associates a CIDR block with your VPC. You can associate a secondary IPv4 CIDR block, or you can associate an
   Amazon-provided IPv6 CIDR block. The IPv6 CIDR block size is fixed at /56.


   For more information about associating CIDR blocks with your VPC and applicable restrictions, see VPC and Subnet Sizing in
   the Amazon Virtual Private Cloud User Guide.

  associate-vpc-cidr-block-request - `com.amazonaws.services.ec2.model.AssociateVpcCidrBlockRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateVpcCidrBlock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AssociateVpcCidrBlockResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AssociateVpcCidrBlockRequest associate-vpc-cidr-block-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateVpcCidrBlockAsync associate-vpc-cidr-block-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AssociateVpcCidrBlockRequest associate-vpc-cidr-block-request]
    (-> this (.associateVpcCidrBlockAsync associate-vpc-cidr-block-request))))

(defn describe-tags-async
  "Describes the specified tags for your EC2 resources.


   For more information about tags, see Tagging Your Resources in the
   Amazon Elastic Compute Cloud User Guide.

  describe-tags-request - `com.amazonaws.services.ec2.model.DescribeTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeTagsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeTagsRequest describe-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTagsAsync describe-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeTagsRequest describe-tags-request]
    (-> this (.describeTagsAsync describe-tags-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeTagsAsync))))

(defn modify-client-vpn-endpoint-async
  "Modifies the specified Client VPN endpoint. You can only modify an endpoint's server certificate information,
   client connection logging information, DNS server, and description. Modifying the DNS server resets existing
   client connections.

  modify-client-vpn-endpoint-request - `com.amazonaws.services.ec2.model.ModifyClientVpnEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyClientVpnEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyClientVpnEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyClientVpnEndpointRequest modify-client-vpn-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyClientVpnEndpointAsync modify-client-vpn-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyClientVpnEndpointRequest modify-client-vpn-endpoint-request]
    (-> this (.modifyClientVpnEndpointAsync modify-client-vpn-endpoint-request))))

(defn cancel-capacity-reservation-async
  "Cancels the specified Capacity Reservation, releases the reserved capacity, and changes the Capacity
   Reservation's state to cancelled.


   Instances running in the reserved capacity continue running until you stop them. Stopped instances that target
   the Capacity Reservation can no longer launch. Modify these instances to either target a different Capacity
   Reservation, launch On-Demand Instance capacity, or run in any open Capacity Reservation that has matching
   attributes and sufficient capacity.

  cancel-capacity-reservation-request - `com.amazonaws.services.ec2.model.CancelCapacityReservationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelCapacityReservation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CancelCapacityReservationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CancelCapacityReservationRequest cancel-capacity-reservation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelCapacityReservationAsync cancel-capacity-reservation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CancelCapacityReservationRequest cancel-capacity-reservation-request]
    (-> this (.cancelCapacityReservationAsync cancel-capacity-reservation-request))))

(defn get-transit-gateway-attachment-propagations-async
  "Lists the route tables to which the specified resource attachment propagates routes.

  get-transit-gateway-attachment-propagations-request - `com.amazonaws.services.ec2.model.GetTransitGatewayAttachmentPropagationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTransitGatewayAttachmentPropagations operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetTransitGatewayAttachmentPropagationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetTransitGatewayAttachmentPropagationsRequest get-transit-gateway-attachment-propagations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTransitGatewayAttachmentPropagationsAsync get-transit-gateway-attachment-propagations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetTransitGatewayAttachmentPropagationsRequest get-transit-gateway-attachment-propagations-request]
    (-> this (.getTransitGatewayAttachmentPropagationsAsync get-transit-gateway-attachment-propagations-request))))

(defn detach-internet-gateway-async
  "Detaches an internet gateway from a VPC, disabling connectivity between the internet and the VPC. The VPC must
   not contain any running instances with Elastic IP addresses or public IPv4 addresses.

  detach-internet-gateway-request - `com.amazonaws.services.ec2.model.DetachInternetGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachInternetGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DetachInternetGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DetachInternetGatewayRequest detach-internet-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachInternetGatewayAsync detach-internet-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DetachInternetGatewayRequest detach-internet-gateway-request]
    (-> this (.detachInternetGatewayAsync detach-internet-gateway-request))))

(defn assign-ipv-6-addresses-async
  "Assigns one or more IPv6 addresses to the specified network interface. You can specify one or more specific IPv6
   addresses, or you can specify the number of IPv6 addresses to be automatically assigned from within the subnet's
   IPv6 CIDR block range. You can assign as many IPv6 addresses to a network interface as you can assign private
   IPv4 addresses, and the limit varies per instance type. For information, see IP Addresses Per
   Network Interface Per Instance Type in the Amazon Elastic Compute Cloud User Guide.

  assign-ipv-6-addresses-request - `com.amazonaws.services.ec2.model.AssignIpv6AddressesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssignIpv6Addresses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AssignIpv6AddressesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AssignIpv6AddressesRequest assign-ipv-6-addresses-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.assignIpv6AddressesAsync assign-ipv-6-addresses-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AssignIpv6AddressesRequest assign-ipv-6-addresses-request]
    (-> this (.assignIpv6AddressesAsync assign-ipv-6-addresses-request))))

(defn describe-availability-zones-async
  "Describes the Availability Zones that are available to you. The results include zones only for the Region you're
   currently using. If there is an event impacting an Availability Zone, you can use this request to view the state
   and any provided message for that Availability Zone.


   For more information, see Regions and
   Availability Zones in the Amazon Elastic Compute Cloud User Guide.

  describe-availability-zones-request - `com.amazonaws.services.ec2.model.DescribeAvailabilityZonesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAvailabilityZones operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeAvailabilityZonesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeAvailabilityZonesRequest describe-availability-zones-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAvailabilityZonesAsync describe-availability-zones-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeAvailabilityZonesRequest describe-availability-zones-request]
    (-> this (.describeAvailabilityZonesAsync describe-availability-zones-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeAvailabilityZonesAsync))))

(defn attach-volume-async
  "Attaches an EBS volume to a running or stopped instance and exposes it to the instance with the specified device
   name.


   Encrypted EBS volumes must be attached to instances that support Amazon EBS encryption. For more information, see
   Amazon EBS Encryption in the
   Amazon Elastic Compute Cloud User Guide.


   After you attach an EBS volume, you must make it available. For more information, see Making an EBS Volume Available
   For Use.


   If a volume has an AWS Marketplace product code:




   The volume can be attached only to a stopped instance.




   AWS Marketplace product codes are copied from the volume to the instance.




   You must be subscribed to the product.




   The instance type and operating system of the instance must support the product. For example, you can't detach a
   volume from a Windows instance and attach it to a Linux instance.




   For more information, see Attaching Amazon EBS
   Volumes in the Amazon Elastic Compute Cloud User Guide.

  attach-volume-request - Contains the parameters for AttachVolume. - `com.amazonaws.services.ec2.model.AttachVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AttachVolumeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AttachVolumeRequest attach-volume-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachVolumeAsync attach-volume-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AttachVolumeRequest attach-volume-request]
    (-> this (.attachVolumeAsync attach-volume-request))))

(defn create-network-acl-entry-async
  "Creates an entry (a rule) in a network ACL with the specified rule number. Each network ACL has a set of numbered
   ingress rules and a separate set of numbered egress rules. When determining whether a packet should be allowed in
   or out of a subnet associated with the ACL, we process the entries in the ACL according to the rule numbers, in
   ascending order. Each network ACL has a set of ingress rules and a separate set of egress rules.


   We recommend that you leave room between the rule numbers (for example, 100, 110, 120, ...), and not number them
   one right after the other (for example, 101, 102, 103, ...). This makes it easier to add a rule between existing
   ones without having to renumber the rules.


   After you add an entry, you can't modify it; you must either replace it, or create an entry and delete the old
   one.


   For more information about network ACLs, see Network ACLs in the Amazon Virtual
   Private Cloud User Guide.

  create-network-acl-entry-request - `com.amazonaws.services.ec2.model.CreateNetworkAclEntryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNetworkAclEntry operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateNetworkAclEntryResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateNetworkAclEntryRequest create-network-acl-entry-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNetworkAclEntryAsync create-network-acl-entry-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateNetworkAclEntryRequest create-network-acl-entry-request]
    (-> this (.createNetworkAclEntryAsync create-network-acl-entry-request))))

(defn delete-transit-gateway-vpc-attachment-async
  "Deletes the specified VPC attachment.

  delete-transit-gateway-vpc-attachment-request - `com.amazonaws.services.ec2.model.DeleteTransitGatewayVpcAttachmentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTransitGatewayVpcAttachment operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteTransitGatewayVpcAttachmentResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayVpcAttachmentRequest delete-transit-gateway-vpc-attachment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTransitGatewayVpcAttachmentAsync delete-transit-gateway-vpc-attachment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayVpcAttachmentRequest delete-transit-gateway-vpc-attachment-request]
    (-> this (.deleteTransitGatewayVpcAttachmentAsync delete-transit-gateway-vpc-attachment-request))))

(defn disable-transit-gateway-route-table-propagation-async
  "Disables the specified resource attachment from propagating routes to the specified propagation route table.

  disable-transit-gateway-route-table-propagation-request - `com.amazonaws.services.ec2.model.DisableTransitGatewayRouteTablePropagationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableTransitGatewayRouteTablePropagation operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisableTransitGatewayRouteTablePropagationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisableTransitGatewayRouteTablePropagationRequest disable-transit-gateway-route-table-propagation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableTransitGatewayRouteTablePropagationAsync disable-transit-gateway-route-table-propagation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisableTransitGatewayRouteTablePropagationRequest disable-transit-gateway-route-table-propagation-request]
    (-> this (.disableTransitGatewayRouteTablePropagationAsync disable-transit-gateway-route-table-propagation-request))))

(defn describe-vpc-classic-link-dns-support-async
  "Describes the ClassicLink DNS support status of one or more VPCs. If enabled, the DNS hostname of a linked
   EC2-Classic instance resolves to its private IP address when addressed from an instance in the VPC to which it's
   linked. Similarly, the DNS hostname of an instance in a VPC resolves to its private IP address when addressed
   from a linked EC2-Classic instance. For more information, see ClassicLink in the Amazon
   Elastic Compute Cloud User Guide.

  describe-vpc-classic-link-dns-support-request - `com.amazonaws.services.ec2.model.DescribeVpcClassicLinkDnsSupportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcClassicLinkDnsSupport operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpcClassicLinkDnsSupportResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpcClassicLinkDnsSupportRequest describe-vpc-classic-link-dns-support-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcClassicLinkDnsSupportAsync describe-vpc-classic-link-dns-support-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpcClassicLinkDnsSupportRequest describe-vpc-classic-link-dns-support-request]
    (-> this (.describeVpcClassicLinkDnsSupportAsync describe-vpc-classic-link-dns-support-request))))

(defn describe-volume-status-async
  "Describes the status of the specified volumes. Volume status provides the result of the checks performed on your
   volumes to determine events that can impair the performance of your volumes. The performance of a volume can be
   affected if an issue occurs on the volume's underlying host. If the volume's underlying host experiences a power
   outage or system issue, after the system is restored, there could be data inconsistencies on the volume. Volume
   events notify you if this occurs. Volume actions notify you if any action needs to be taken in response to the
   event.


   The DescribeVolumeStatus operation provides the following information about the specified volumes:


   Status: Reflects the current status of the volume. The possible values are ok,
   impaired , warning, or insufficient-data. If all checks pass, the overall
   status of the volume is ok. If the check fails, the overall status is impaired. If the
   status is insufficient-data, then the checks may still be taking place on your volume at the time.
   We recommend that you retry the request. For more information about volume status, see Monitoring the Status of
   Your Volumes in the Amazon Elastic Compute Cloud User Guide.


   Events: Reflect the cause of a volume status and may require you to take action. For example, if your
   volume returns an impaired status, then the volume event might be
   potential-data-inconsistency. This means that your volume has been affected by an issue with the
   underlying host, has all I/O operations disabled, and may have inconsistent data.


   Actions: Reflect the actions you may have to take in response to an event. For example, if the status of
   the volume is impaired and the volume event shows potential-data-inconsistency, then
   the action shows enable-volume-io. This means that you may want to enable the I/O operations for the
   volume by calling the EnableVolumeIO action and then check the volume for data consistency.


   Volume status is based on the volume status checks, and does not reflect the volume state. Therefore, volume
   status does not indicate volumes in the error state (for example, when a volume is incapable of
   accepting I/O.)

  describe-volume-status-request - `com.amazonaws.services.ec2.model.DescribeVolumeStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVolumeStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVolumeStatusResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVolumeStatusRequest describe-volume-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVolumeStatusAsync describe-volume-status-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVolumeStatusRequest describe-volume-status-request]
    (-> this (.describeVolumeStatusAsync describe-volume-status-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeVolumeStatusAsync))))

(defn modify-vpc-peering-connection-options-async
  "Modifies the VPC peering connection options on one side of a VPC peering connection. You can do the following:




   Enable/disable communication over the peering connection between an EC2-Classic instance that's linked to your
   VPC (using ClassicLink) and instances in the peer VPC.




   Enable/disable communication over the peering connection between instances in your VPC and an EC2-Classic
   instance that's linked to the peer VPC.




   Enable/disable the ability to resolve public DNS hostnames to private IP addresses when queried from instances in
   the peer VPC.




   If the peered VPCs are in the same AWS account, you can enable DNS resolution for queries from the local VPC.
   This ensures that queries from the local VPC resolve to private IP addresses in the peer VPC. This option is not
   available if the peered VPCs are in different AWS accounts or different Regions. For peered VPCs in different AWS
   accounts, each AWS account owner must initiate a separate request to modify the peering connection options. For
   inter-region peering connections, you must use the Region for the requester VPC to modify the requester VPC
   peering options and the Region for the accepter VPC to modify the accepter VPC peering options. To verify which
   VPCs are the accepter and the requester for a VPC peering connection, use the
   DescribeVpcPeeringConnections command.

  modify-vpc-peering-connection-options-request - `com.amazonaws.services.ec2.model.ModifyVpcPeeringConnectionOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyVpcPeeringConnectionOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyVpcPeeringConnectionOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyVpcPeeringConnectionOptionsRequest modify-vpc-peering-connection-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyVpcPeeringConnectionOptionsAsync modify-vpc-peering-connection-options-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyVpcPeeringConnectionOptionsRequest modify-vpc-peering-connection-options-request]
    (-> this (.modifyVpcPeeringConnectionOptionsAsync modify-vpc-peering-connection-options-request))))

(defn describe-vpc-attribute-async
  "Describes the specified attribute of the specified VPC. You can specify only one attribute at a time.

  describe-vpc-attribute-request - `com.amazonaws.services.ec2.model.DescribeVpcAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpcAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpcAttributeRequest describe-vpc-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcAttributeAsync describe-vpc-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpcAttributeRequest describe-vpc-attribute-request]
    (-> this (.describeVpcAttributeAsync describe-vpc-attribute-request))))

(defn describe-host-reservation-offerings-async
  "Describes the Dedicated Host reservations that are available to purchase.


   The results describe all the Dedicated Host reservation offerings, including offerings that may not match the
   instance family and Region of your Dedicated Hosts. When purchasing an offering, ensure that the instance family
   and Region of the offering matches that of the Dedicated Hosts with which it is to be associated. For more
   information about supported instance types, see Dedicated Hosts
   Overview in the Amazon Elastic Compute Cloud User Guide.

  describe-host-reservation-offerings-request - `com.amazonaws.services.ec2.model.DescribeHostReservationOfferingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeHostReservationOfferings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeHostReservationOfferingsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeHostReservationOfferingsRequest describe-host-reservation-offerings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeHostReservationOfferingsAsync describe-host-reservation-offerings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeHostReservationOfferingsRequest describe-host-reservation-offerings-request]
    (-> this (.describeHostReservationOfferingsAsync describe-host-reservation-offerings-request))))

(defn describe-public-ipv-4-pools-async
  "Describes the specified IPv4 address pools.

  describe-public-ipv-4-pools-request - `com.amazonaws.services.ec2.model.DescribePublicIpv4PoolsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePublicIpv4Pools operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribePublicIpv4PoolsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribePublicIpv4PoolsRequest describe-public-ipv-4-pools-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePublicIpv4PoolsAsync describe-public-ipv-4-pools-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribePublicIpv4PoolsRequest describe-public-ipv-4-pools-request]
    (-> this (.describePublicIpv4PoolsAsync describe-public-ipv-4-pools-request))))

(defn reset-network-interface-attribute-async
  "Resets a network interface attribute. You can specify only one attribute at a time.

  reset-network-interface-attribute-request - Contains the parameters for ResetNetworkInterfaceAttribute. - `com.amazonaws.services.ec2.model.ResetNetworkInterfaceAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetNetworkInterfaceAttribute operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ResetNetworkInterfaceAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ResetNetworkInterfaceAttributeRequest reset-network-interface-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetNetworkInterfaceAttributeAsync reset-network-interface-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ResetNetworkInterfaceAttributeRequest reset-network-interface-attribute-request]
    (-> this (.resetNetworkInterfaceAttributeAsync reset-network-interface-attribute-request))))

(defn create-client-vpn-route-async
  "Adds a route to a network to a Client VPN endpoint. Each Client VPN endpoint has a route table that describes the
   available destination network routes. Each route in the route table specifies the path for traﬃc to speciﬁc
   resources or networks.

  create-client-vpn-route-request - `com.amazonaws.services.ec2.model.CreateClientVpnRouteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateClientVpnRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateClientVpnRouteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateClientVpnRouteRequest create-client-vpn-route-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClientVpnRouteAsync create-client-vpn-route-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateClientVpnRouteRequest create-client-vpn-route-request]
    (-> this (.createClientVpnRouteAsync create-client-vpn-route-request))))

(defn create-volume-async
  "Creates an EBS volume that can be attached to an instance in the same Availability Zone. The volume is created in
   the regional endpoint that you send the HTTP request to. For more information see Regions and Endpoints.


   You can create a new empty volume or restore a volume from an EBS snapshot. Any AWS Marketplace product codes
   from the snapshot are propagated to the volume.


   You can create encrypted volumes. Encrypted volumes must be attached to instances that support Amazon EBS
   encryption. Volumes that are created from encrypted snapshots are also automatically encrypted. For more
   information, see Amazon EBS
   Encryption in the Amazon Elastic Compute Cloud User Guide.


   You can tag your volumes during creation. For more information, see Tagging Your Amazon EC2 Resources
   in the Amazon Elastic Compute Cloud User Guide.


   For more information, see Creating an Amazon EBS
   Volume in the Amazon Elastic Compute Cloud User Guide.

  create-volume-request - Contains the parameters for CreateVolume. - `com.amazonaws.services.ec2.model.CreateVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateVolumeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateVolumeRequest create-volume-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVolumeAsync create-volume-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateVolumeRequest create-volume-request]
    (-> this (.createVolumeAsync create-volume-request))))

(defn delete-fleets-async
  "Deletes the specified EC2 Fleet.


   After you delete an EC2 Fleet, it launches no new instances. You must specify whether an EC2 Fleet should also
   terminate its instances. If you terminate the instances, the EC2 Fleet enters the
   deleted_terminating state. Otherwise, the EC2 Fleet enters the deleted_running state,
   and the instances continue to run until they are interrupted or you terminate them manually.

  delete-fleets-request - `com.amazonaws.services.ec2.model.DeleteFleetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFleets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteFleetsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteFleetsRequest delete-fleets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFleetsAsync delete-fleets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteFleetsRequest delete-fleets-request]
    (-> this (.deleteFleetsAsync delete-fleets-request))))

(defn associate-iam-instance-profile-async
  "Associates an IAM instance profile with a running or stopped instance. You cannot associate more than one IAM
   instance profile with an instance.

  associate-iam-instance-profile-request - `com.amazonaws.services.ec2.model.AssociateIamInstanceProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateIamInstanceProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AssociateIamInstanceProfileResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AssociateIamInstanceProfileRequest associate-iam-instance-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateIamInstanceProfileAsync associate-iam-instance-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AssociateIamInstanceProfileRequest associate-iam-instance-profile-request]
    (-> this (.associateIamInstanceProfileAsync associate-iam-instance-profile-request))))

(defn unassign-ipv-6-addresses-async
  "Unassigns one or more IPv6 addresses from a network interface.

  unassign-ipv-6-addresses-request - `com.amazonaws.services.ec2.model.UnassignIpv6AddressesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnassignIpv6Addresses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.UnassignIpv6AddressesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.UnassignIpv6AddressesRequest unassign-ipv-6-addresses-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unassignIpv6AddressesAsync unassign-ipv-6-addresses-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.UnassignIpv6AddressesRequest unassign-ipv-6-addresses-request]
    (-> this (.unassignIpv6AddressesAsync unassign-ipv-6-addresses-request))))

(defn describe-subnets-async
  "Describes one or more of your subnets.


   For more information, see Your VPC
   and Subnets in the Amazon Virtual Private Cloud User Guide.

  describe-subnets-request - `com.amazonaws.services.ec2.model.DescribeSubnetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSubnets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeSubnetsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeSubnetsRequest describe-subnets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSubnetsAsync describe-subnets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeSubnetsRequest describe-subnets-request]
    (-> this (.describeSubnetsAsync describe-subnets-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeSubnetsAsync))))

(defn delete-nat-gateway-async
  "Deletes the specified NAT gateway. Deleting a NAT gateway disassociates its Elastic IP address, but does not
   release the address from your account. Deleting a NAT gateway does not delete any NAT gateway routes in your
   route tables.

  delete-nat-gateway-request - `com.amazonaws.services.ec2.model.DeleteNatGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNatGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteNatGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteNatGatewayRequest delete-nat-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNatGatewayAsync delete-nat-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteNatGatewayRequest delete-nat-gateway-request]
    (-> this (.deleteNatGatewayAsync delete-nat-gateway-request))))

(defn register-image-async
  "Registers an AMI. When you're creating an AMI, this is the final step you must complete before you can launch an
   instance from the AMI. For more information about creating AMIs, see Creating Your Own AMIs in the
   Amazon Elastic Compute Cloud User Guide.



   For Amazon EBS-backed instances, CreateImage creates and registers the AMI in a single request, so you
   don't have to register the AMI yourself.



   You can also use RegisterImage to create an Amazon EBS-backed Linux AMI from a snapshot of a root
   device volume. You specify the snapshot using the block device mapping. For more information, see Launching a Linux
   Instance from a Backup in the Amazon Elastic Compute Cloud User Guide.


   You can't register an image where a secondary (non-root) snapshot has AWS Marketplace product codes.


   Some Linux distributions, such as Red Hat Enterprise Linux (RHEL) and SUSE Linux Enterprise Server (SLES), use
   the EC2 billing product code associated with an AMI to verify the subscription status for package updates.
   Creating an AMI from an EBS snapshot does not maintain this billing code, and instances launched from such an AMI
   are not able to connect to package update infrastructure. If you purchase a Reserved Instance offering for one of
   these Linux distributions and launch instances using an AMI that does not contain the required billing code, your
   Reserved Instance is not applied to these instances.


   To create an AMI for operating systems that require a billing code, see CreateImage.


   If needed, you can deregister an AMI at any time. Any modifications you make to an AMI backed by an instance
   store volume invalidates its registration. If you make changes to an image, deregister the previous image and
   register the new image.

  register-image-request - Contains the parameters for RegisterImage. - `com.amazonaws.services.ec2.model.RegisterImageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RegisterImageResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RegisterImageRequest register-image-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerImageAsync register-image-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RegisterImageRequest register-image-request]
    (-> this (.registerImageAsync register-image-request))))

(defn request-spot-fleet-async
  "Creates a Spot Fleet request.


   The Spot Fleet request specifies the total target capacity and the On-Demand target capacity. Amazon EC2
   calculates the difference between the total capacity and On-Demand capacity, and launches the difference as Spot
   capacity.


   You can submit a single request that includes multiple launch specifications that vary by instance type, AMI,
   Availability Zone, or subnet.


   By default, the Spot Fleet requests Spot Instances in the Spot pool where the price per unit is the lowest. Each
   launch specification can include its own instance weighting that reflects the value of the instance type to your
   application workload.


   Alternatively, you can specify that the Spot Fleet distribute the target capacity across the Spot pools included
   in its launch specifications. By ensuring that the Spot Instances in your Spot Fleet are in different Spot pools,
   you can improve the availability of your fleet.


   You can specify tags for the Spot Instances. You cannot tag other resource types in a Spot Fleet request because
   only the instance resource type is supported.


   For more information, see Spot Fleet Requests in
   the Amazon EC2 User Guide for Linux Instances.

  request-spot-fleet-request - Contains the parameters for RequestSpotFleet. - `com.amazonaws.services.ec2.model.RequestSpotFleetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RequestSpotFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RequestSpotFleetResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RequestSpotFleetRequest request-spot-fleet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.requestSpotFleetAsync request-spot-fleet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.RequestSpotFleetRequest request-spot-fleet-request]
    (-> this (.requestSpotFleetAsync request-spot-fleet-request))))

(defn create-route-async
  "Creates a route in a route table within a VPC.


   You must specify one of the following targets: internet gateway or virtual private gateway, NAT instance, NAT
   gateway, VPC peering connection, network interface, or egress-only internet gateway.


   When determining how to route traffic, we use the route with the most specific match. For example, traffic is
   destined for the IPv4 address 192.0.2.3, and the route table includes the following two IPv4 routes:




   192.0.2.0/24 (goes to some target A)




   192.0.2.0/28 (goes to some target B)




   Both routes apply to the traffic destined for 192.0.2.3. However, the second route in the list
   covers a smaller number of IP addresses and is therefore more specific, so we use that route to determine where
   to target the traffic.


   For more information about route tables, see Route Tables in the Amazon
   Virtual Private Cloud User Guide.

  create-route-request - `com.amazonaws.services.ec2.model.CreateRouteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateRouteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateRouteRequest create-route-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRouteAsync create-route-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateRouteRequest create-route-request]
    (-> this (.createRouteAsync create-route-request))))

(defn get-password-data-async
  "Retrieves the encrypted administrator password for a running Windows instance.


   The Windows password is generated at boot by the EC2Config service or EC2Launch scripts
   (Windows Server 2016 and later). This usually only happens the first time an instance is launched. For more
   information, see EC2Config and EC2Launch in the Amazon Elastic
   Compute Cloud User Guide.


   For the EC2Config service, the password is not generated for rebundled AMIs unless
   Ec2SetPassword is enabled before bundling.


   The password is encrypted using the key pair that you specified when you launched the instance. You must provide
   the corresponding key pair file.


   When you launch an instance, password generation and encryption may take a few minutes. If you try to retrieve
   the password before it's available, the output returns an empty string. We recommend that you wait up to 15
   minutes after launching an instance before trying to retrieve the generated password.

  get-password-data-request - `com.amazonaws.services.ec2.model.GetPasswordDataRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPasswordData operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetPasswordDataResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetPasswordDataRequest get-password-data-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPasswordDataAsync get-password-data-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetPasswordDataRequest get-password-data-request]
    (-> this (.getPasswordDataAsync get-password-data-request))))

(defn disable-vgw-route-propagation-async
  "Disables a virtual private gateway (VGW) from propagating routes to a specified route table of a VPC.

  disable-vgw-route-propagation-request - Contains the parameters for DisableVgwRoutePropagation. - `com.amazonaws.services.ec2.model.DisableVgwRoutePropagationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableVgwRoutePropagation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisableVgwRoutePropagationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisableVgwRoutePropagationRequest disable-vgw-route-propagation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableVgwRoutePropagationAsync disable-vgw-route-propagation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisableVgwRoutePropagationRequest disable-vgw-route-propagation-request]
    (-> this (.disableVgwRoutePropagationAsync disable-vgw-route-propagation-request))))

(defn purchase-host-reservation-async
  "Purchase a reservation with configurations that match those of your Dedicated Host. You must have active
   Dedicated Hosts in your account before you purchase a reservation. This action results in the specified
   reservation being purchased and charged to your account.

  purchase-host-reservation-request - `com.amazonaws.services.ec2.model.PurchaseHostReservationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PurchaseHostReservation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.PurchaseHostReservationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.PurchaseHostReservationRequest purchase-host-reservation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.purchaseHostReservationAsync purchase-host-reservation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.PurchaseHostReservationRequest purchase-host-reservation-request]
    (-> this (.purchaseHostReservationAsync purchase-host-reservation-request))))

(defn create-transit-gateway-vpc-attachment-async
  "Attaches the specified VPC to the specified transit gateway.


   If you attach a VPC with a CIDR range that overlaps the CIDR range of a VPC that is already attached, the new VPC
   CIDR range is not propagated to the default propagation route table.


   To send VPC traffic to an attached transit gateway, add a route to the VPC route table using CreateRoute.

  create-transit-gateway-vpc-attachment-request - `com.amazonaws.services.ec2.model.CreateTransitGatewayVpcAttachmentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTransitGatewayVpcAttachment operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateTransitGatewayVpcAttachmentResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateTransitGatewayVpcAttachmentRequest create-transit-gateway-vpc-attachment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTransitGatewayVpcAttachmentAsync create-transit-gateway-vpc-attachment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateTransitGatewayVpcAttachmentRequest create-transit-gateway-vpc-attachment-request]
    (-> this (.createTransitGatewayVpcAttachmentAsync create-transit-gateway-vpc-attachment-request))))

(defn describe-egress-only-internet-gateways-async
  "Describes one or more of your egress-only internet gateways.

  describe-egress-only-internet-gateways-request - `com.amazonaws.services.ec2.model.DescribeEgressOnlyInternetGatewaysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEgressOnlyInternetGateways operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeEgressOnlyInternetGatewaysResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeEgressOnlyInternetGatewaysRequest describe-egress-only-internet-gateways-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEgressOnlyInternetGatewaysAsync describe-egress-only-internet-gateways-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeEgressOnlyInternetGatewaysRequest describe-egress-only-internet-gateways-request]
    (-> this (.describeEgressOnlyInternetGatewaysAsync describe-egress-only-internet-gateways-request))))

(defn delete-traffic-mirror-filter-rule-async
  "Deletes the specified Traffic Mirror rule.

  delete-traffic-mirror-filter-rule-request - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTrafficMirrorFilterRule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRuleResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRuleRequest delete-traffic-mirror-filter-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTrafficMirrorFilterRuleAsync delete-traffic-mirror-filter-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRuleRequest delete-traffic-mirror-filter-rule-request]
    (-> this (.deleteTrafficMirrorFilterRuleAsync delete-traffic-mirror-filter-rule-request))))

(defn deregister-image-async
  "Deregisters the specified AMI. After you deregister an AMI, it can't be used to launch new instances; however, it
   doesn't affect any instances that you've already launched from the AMI. You'll continue to incur usage costs for
   those instances until you terminate them.


   When you deregister an Amazon EBS-backed AMI, it doesn't affect the snapshot that was created for the root volume
   of the instance during the AMI creation process. When you deregister an instance store-backed AMI, it doesn't
   affect the files that you uploaded to Amazon S3 when you created the AMI.

  deregister-image-request - Contains the parameters for DeregisterImage. - `com.amazonaws.services.ec2.model.DeregisterImageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeregisterImageResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeregisterImageRequest deregister-image-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterImageAsync deregister-image-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeregisterImageRequest deregister-image-request]
    (-> this (.deregisterImageAsync deregister-image-request))))

(defn copy-snapshot-async
  "Copies a point-in-time snapshot of an EBS volume and stores it in Amazon S3. You can copy the snapshot within the
   same Region or from one Region to another. You can use the snapshot to create EBS volumes or Amazon Machine
   Images (AMIs).


   Copies of encrypted EBS snapshots remain encrypted. Copies of unencrypted snapshots remain unencrypted, unless
   you enable encryption for the snapshot copy operation. By default, encrypted snapshot copies use the default AWS
   Key Management Service (AWS KMS) customer master key (CMK); however, you can specify a different CMK.


   To copy an encrypted snapshot that has been shared from another account, you must have permissions for the CMK
   used to encrypt the snapshot.


   Snapshots created by copying another snapshot have an arbitrary volume ID that should not be used for any
   purpose.


   For more information, see Copying an Amazon EBS
   Snapshot in the Amazon Elastic Compute Cloud User Guide.

  copy-snapshot-request - Contains the parameters for CopySnapshot. - `com.amazonaws.services.ec2.model.CopySnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopySnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CopySnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CopySnapshotRequest copy-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copySnapshotAsync copy-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CopySnapshotRequest copy-snapshot-request]
    (-> this (.copySnapshotAsync copy-snapshot-request))))

(defn report-instance-status-async
  "Submits feedback about the status of an instance. The instance must be in the running state. If your
   experience with the instance differs from the instance status returned by DescribeInstanceStatus, use
   ReportInstanceStatus to report your experience with the instance. Amazon EC2 collects this information to
   improve the accuracy of status checks.


   Use of this action does not change the value returned by DescribeInstanceStatus.

  report-instance-status-request - `com.amazonaws.services.ec2.model.ReportInstanceStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReportInstanceStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ReportInstanceStatusResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ReportInstanceStatusRequest report-instance-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.reportInstanceStatusAsync report-instance-status-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ReportInstanceStatusRequest report-instance-status-request]
    (-> this (.reportInstanceStatusAsync report-instance-status-request))))

(defn delete-vpc-peering-connection-async
  "Deletes a VPC peering connection. Either the owner of the requester VPC or the owner of the accepter VPC can
   delete the VPC peering connection if it's in the active state. The owner of the requester VPC can
   delete a VPC peering connection in the pending-acceptance state. You cannot delete a VPC peering
   connection that's in the failed state.

  delete-vpc-peering-connection-request - `com.amazonaws.services.ec2.model.DeleteVpcPeeringConnectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVpcPeeringConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteVpcPeeringConnectionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteVpcPeeringConnectionRequest delete-vpc-peering-connection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVpcPeeringConnectionAsync delete-vpc-peering-connection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteVpcPeeringConnectionRequest delete-vpc-peering-connection-request]
    (-> this (.deleteVpcPeeringConnectionAsync delete-vpc-peering-connection-request))))

(defn describe-account-attributes-async
  "Describes attributes of your AWS account. The following are the supported account attributes:




   supported-platforms: Indicates whether your account can launch instances into EC2-Classic and
   EC2-VPC, or only into EC2-VPC.




   default-vpc: The ID of the default VPC for your account, or none.




   max-instances: The maximum number of On-Demand Instances that you can run.




   vpc-max-security-groups-per-interface: The maximum number of security groups that you can assign to
   a network interface.




   max-elastic-ips: The maximum number of Elastic IP addresses that you can allocate for use with
   EC2-Classic.




   vpc-max-elastic-ips: The maximum number of Elastic IP addresses that you can allocate for use with
   EC2-VPC.

  describe-account-attributes-request - `com.amazonaws.services.ec2.model.DescribeAccountAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeAccountAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeAccountAttributesRequest describe-account-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountAttributesAsync describe-account-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeAccountAttributesRequest describe-account-attributes-request]
    (-> this (.describeAccountAttributesAsync describe-account-attributes-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeAccountAttributesAsync))))

(defn enable-volume-io-async
  "Enables I/O operations for a volume that had I/O operations disabled because the data on the volume was
   potentially inconsistent.

  enable-volume-io-request - Contains the parameters for EnableVolumeIO. - `com.amazonaws.services.ec2.model.EnableVolumeIORequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableVolumeIO operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.EnableVolumeIOResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.EnableVolumeIORequest enable-volume-io-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableVolumeIOAsync enable-volume-io-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.EnableVolumeIORequest enable-volume-io-request]
    (-> this (.enableVolumeIOAsync enable-volume-io-request))))

(defn describe-hosts-async
  "Describes the specified Dedicated Hosts or all your Dedicated Hosts.


   The results describe only the Dedicated Hosts in the Region you're currently using. All listed instances consume
   capacity on your Dedicated Host. Dedicated Hosts that have recently been released are listed with the state
   released.

  describe-hosts-request - `com.amazonaws.services.ec2.model.DescribeHostsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeHosts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeHostsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeHostsRequest describe-hosts-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeHostsAsync describe-hosts-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeHostsRequest describe-hosts-request]
    (-> this (.describeHostsAsync describe-hosts-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeHostsAsync))))

(defn describe-vpc-classic-link-async
  "Describes the ClassicLink status of one or more VPCs.

  describe-vpc-classic-link-request - `com.amazonaws.services.ec2.model.DescribeVpcClassicLinkRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcClassicLink operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpcClassicLinkResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpcClassicLinkRequest describe-vpc-classic-link-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcClassicLinkAsync describe-vpc-classic-link-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpcClassicLinkRequest describe-vpc-classic-link-request]
    (-> this (.describeVpcClassicLinkAsync describe-vpc-classic-link-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeVpcClassicLinkAsync))))

(defn modify-vpc-endpoint-async
  "Modifies attributes of a specified VPC endpoint. The attributes that you can modify depend on the type of VPC
   endpoint (interface or gateway). For more information, see VPC Endpoints in the Amazon
   Virtual Private Cloud User Guide.

  modify-vpc-endpoint-request - Contains the parameters for ModifyVpcEndpoint. - `com.amazonaws.services.ec2.model.ModifyVpcEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyVpcEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyVpcEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointRequest modify-vpc-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyVpcEndpointAsync modify-vpc-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointRequest modify-vpc-endpoint-request]
    (-> this (.modifyVpcEndpointAsync modify-vpc-endpoint-request))))

(defn create-reserved-instances-listing-async
  "Creates a listing for Amazon EC2 Standard Reserved Instances to be sold in the Reserved Instance Marketplace. You
   can submit one Standard Reserved Instance listing at a time. To get a list of your Standard Reserved Instances,
   you can use the DescribeReservedInstances operation.



   Only Standard Reserved Instances can be sold in the Reserved Instance Marketplace. Convertible Reserved Instances
   cannot be sold.



   The Reserved Instance Marketplace matches sellers who want to resell Standard Reserved Instance capacity that
   they no longer need with buyers who want to purchase additional capacity. Reserved Instances bought and sold
   through the Reserved Instance Marketplace work like any other Reserved Instances.


   To sell your Standard Reserved Instances, you must first register as a seller in the Reserved Instance
   Marketplace. After completing the registration process, you can create a Reserved Instance Marketplace listing of
   some or all of your Standard Reserved Instances, and specify the upfront price to receive for them. Your Standard
   Reserved Instance listings then become available for purchase. To view the details of your Standard Reserved
   Instance listing, you can use the DescribeReservedInstancesListings operation.


   For more information, see Reserved Instance
   Marketplace in the Amazon Elastic Compute Cloud User Guide.

  create-reserved-instances-listing-request - Contains the parameters for CreateReservedInstancesListing. - `com.amazonaws.services.ec2.model.CreateReservedInstancesListingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateReservedInstancesListing operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateReservedInstancesListingResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateReservedInstancesListingRequest create-reserved-instances-listing-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createReservedInstancesListingAsync create-reserved-instances-listing-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateReservedInstancesListingRequest create-reserved-instances-listing-request]
    (-> this (.createReservedInstancesListingAsync create-reserved-instances-listing-request))))

(defn disassociate-vpc-cidr-block-async
  "Disassociates a CIDR block from a VPC. To disassociate the CIDR block, you must specify its association ID. You
   can get the association ID by using DescribeVpcs. You must detach or delete all gateways and resources
   that are associated with the CIDR block before you can disassociate it.


   You cannot disassociate the CIDR block with which you originally created the VPC (the primary CIDR block).

  disassociate-vpc-cidr-block-request - `com.amazonaws.services.ec2.model.DisassociateVpcCidrBlockRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateVpcCidrBlock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisassociateVpcCidrBlockResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisassociateVpcCidrBlockRequest disassociate-vpc-cidr-block-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateVpcCidrBlockAsync disassociate-vpc-cidr-block-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisassociateVpcCidrBlockRequest disassociate-vpc-cidr-block-request]
    (-> this (.disassociateVpcCidrBlockAsync disassociate-vpc-cidr-block-request))))

(defn describe-moving-addresses-async
  "Describes your Elastic IP addresses that are being moved to the EC2-VPC platform, or that are being restored to
   the EC2-Classic platform. This request does not return information about any other Elastic IP addresses in your
   account.

  describe-moving-addresses-request - `com.amazonaws.services.ec2.model.DescribeMovingAddressesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMovingAddresses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeMovingAddressesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeMovingAddressesRequest describe-moving-addresses-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMovingAddressesAsync describe-moving-addresses-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeMovingAddressesRequest describe-moving-addresses-request]
    (-> this (.describeMovingAddressesAsync describe-moving-addresses-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeMovingAddressesAsync))))

(defn import-key-pair-async
  "Imports the public key from an RSA key pair that you created with a third-party tool. Compare this with
   CreateKeyPair, in which AWS creates the key pair and gives the keys to you (AWS keeps a copy of the public
   key). With ImportKeyPair, you create the key pair and give AWS just the public key. The private key is never
   transferred between you and AWS.


   For more information about key pairs, see Key Pairs in the Amazon
   Elastic Compute Cloud User Guide.

  import-key-pair-request - `com.amazonaws.services.ec2.model.ImportKeyPairRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportKeyPair operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ImportKeyPairResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ImportKeyPairRequest import-key-pair-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importKeyPairAsync import-key-pair-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ImportKeyPairRequest import-key-pair-request]
    (-> this (.importKeyPairAsync import-key-pair-request))))

(defn describe-route-tables-async
  "Describes one or more of your route tables.


   Each subnet in your VPC must be associated with a route table. If a subnet is not explicitly associated with any
   route table, it is implicitly associated with the main route table. This command does not return the subnet ID
   for implicit associations.


   For more information, see Route
   Tables in the Amazon Virtual Private Cloud User Guide.

  describe-route-tables-request - `com.amazonaws.services.ec2.model.DescribeRouteTablesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRouteTables operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeRouteTablesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeRouteTablesRequest describe-route-tables-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRouteTablesAsync describe-route-tables-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeRouteTablesRequest describe-route-tables-request]
    (-> this (.describeRouteTablesAsync describe-route-tables-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeRouteTablesAsync))))

(defn delete-snapshot-async
  "Deletes the specified snapshot.


   When you make periodic snapshots of a volume, the snapshots are incremental, and only the blocks on the device
   that have changed since your last snapshot are saved in the new snapshot. When you delete a snapshot, only the
   data not needed for any other snapshot is removed. So regardless of which prior snapshots have been deleted, all
   active snapshots will have access to all the information needed to restore the volume.


   You cannot delete a snapshot of the root device of an EBS volume used by a registered AMI. You must first
   de-register the AMI before you can delete the snapshot.


   For more information, see Deleting an Amazon EBS
   Snapshot in the Amazon Elastic Compute Cloud User Guide.

  delete-snapshot-request - Contains the parameters for DeleteSnapshot. - `com.amazonaws.services.ec2.model.DeleteSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteSnapshotRequest delete-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSnapshotAsync delete-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteSnapshotRequest delete-snapshot-request]
    (-> this (.deleteSnapshotAsync delete-snapshot-request))))

(defn get-reserved-instances-exchange-quote-async
  "Returns a quote and exchange information for exchanging one or more specified Convertible Reserved Instances for
   a new Convertible Reserved Instance. If the exchange cannot be performed, the reason is returned in the response.
   Use AcceptReservedInstancesExchangeQuote to perform the exchange.

  get-reserved-instances-exchange-quote-request - Contains the parameters for GetReservedInstanceExchangeQuote. - `com.amazonaws.services.ec2.model.GetReservedInstancesExchangeQuoteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetReservedInstancesExchangeQuote operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetReservedInstancesExchangeQuoteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetReservedInstancesExchangeQuoteRequest get-reserved-instances-exchange-quote-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getReservedInstancesExchangeQuoteAsync get-reserved-instances-exchange-quote-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.GetReservedInstancesExchangeQuoteRequest get-reserved-instances-exchange-quote-request]
    (-> this (.getReservedInstancesExchangeQuoteAsync get-reserved-instances-exchange-quote-request))))

(defn import-image-async
  "Import single or multi-volume disk images or EBS snapshots into an Amazon Machine Image (AMI). For more
   information, see Importing a VM as an
   Image Using VM Import/Export in the VM Import/Export User Guide.

  import-image-request - `com.amazonaws.services.ec2.model.ImportImageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ImportImageResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ImportImageRequest import-image-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importImageAsync import-image-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ImportImageRequest import-image-request]
    (-> this (.importImageAsync import-image-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.importImageAsync))))

(defn modify-instance-credit-specification-async
  "Modifies the credit option for CPU usage on a running or stopped T2 or T3 instance. The credit options are
   standard and unlimited.


   For more information, see Burstable
   Performance Instances in the Amazon Elastic Compute Cloud User Guide.

  modify-instance-credit-specification-request - `com.amazonaws.services.ec2.model.ModifyInstanceCreditSpecificationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyInstanceCreditSpecification operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyInstanceCreditSpecificationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyInstanceCreditSpecificationRequest modify-instance-credit-specification-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyInstanceCreditSpecificationAsync modify-instance-credit-specification-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ModifyInstanceCreditSpecificationRequest modify-instance-credit-specification-request]
    (-> this (.modifyInstanceCreditSpecificationAsync modify-instance-credit-specification-request))))

(defn unmonitor-instances-async
  "Disables detailed monitoring for a running instance. For more information, see Monitoring Your Instances and
   Volumes in the Amazon Elastic Compute Cloud User Guide.

  unmonitor-instances-request - `com.amazonaws.services.ec2.model.UnmonitorInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnmonitorInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.UnmonitorInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.UnmonitorInstancesRequest unmonitor-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unmonitorInstancesAsync unmonitor-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.UnmonitorInstancesRequest unmonitor-instances-request]
    (-> this (.unmonitorInstancesAsync unmonitor-instances-request))))

(defn delete-network-acl-async
  "Deletes the specified network ACL. You can't delete the ACL if it's associated with any subnets. You can't delete
   the default network ACL.

  delete-network-acl-request - `com.amazonaws.services.ec2.model.DeleteNetworkAclRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNetworkAcl operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteNetworkAclResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteNetworkAclRequest delete-network-acl-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNetworkAclAsync delete-network-acl-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DeleteNetworkAclRequest delete-network-acl-request]
    (-> this (.deleteNetworkAclAsync delete-network-acl-request))))

(defn describe-client-vpn-connections-async
  "Describes active client connections and connections that have been terminated within the last 60 minutes for the
   specified Client VPN endpoint.

  describe-client-vpn-connections-request - `com.amazonaws.services.ec2.model.DescribeClientVpnConnectionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClientVpnConnections operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeClientVpnConnectionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeClientVpnConnectionsRequest describe-client-vpn-connections-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClientVpnConnectionsAsync describe-client-vpn-connections-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeClientVpnConnectionsRequest describe-client-vpn-connections-request]
    (-> this (.describeClientVpnConnectionsAsync describe-client-vpn-connections-request))))

(defn describe-transit-gateway-vpc-attachments-async
  "Describes one or more VPC attachments. By default, all VPC attachments are described. Alternatively, you can
   filter the results.

  describe-transit-gateway-vpc-attachments-request - `com.amazonaws.services.ec2.model.DescribeTransitGatewayVpcAttachmentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTransitGatewayVpcAttachments operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeTransitGatewayVpcAttachmentsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeTransitGatewayVpcAttachmentsRequest describe-transit-gateway-vpc-attachments-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTransitGatewayVpcAttachmentsAsync describe-transit-gateway-vpc-attachments-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeTransitGatewayVpcAttachmentsRequest describe-transit-gateway-vpc-attachments-request]
    (-> this (.describeTransitGatewayVpcAttachmentsAsync describe-transit-gateway-vpc-attachments-request))))

(defn describe-vpc-endpoint-service-configurations-async
  "Describes the VPC endpoint service configurations in your account (your services).

  describe-vpc-endpoint-service-configurations-request - `com.amazonaws.services.ec2.model.DescribeVpcEndpointServiceConfigurationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcEndpointServiceConfigurations operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpcEndpointServiceConfigurationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointServiceConfigurationsRequest describe-vpc-endpoint-service-configurations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcEndpointServiceConfigurationsAsync describe-vpc-endpoint-service-configurations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointServiceConfigurationsRequest describe-vpc-endpoint-service-configurations-request]
    (-> this (.describeVpcEndpointServiceConfigurationsAsync describe-vpc-endpoint-service-configurations-request))))

(defn copy-fpga-image-async
  "Copies the specified Amazon FPGA Image (AFI) to the current Region.

  copy-fpga-image-request - `com.amazonaws.services.ec2.model.CopyFpgaImageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyFpgaImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CopyFpgaImageResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CopyFpgaImageRequest copy-fpga-image-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyFpgaImageAsync copy-fpga-image-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CopyFpgaImageRequest copy-fpga-image-request]
    (-> this (.copyFpgaImageAsync copy-fpga-image-request))))

(defn accept-reserved-instances-exchange-quote-async
  "Accepts the Convertible Reserved Instance exchange quote described in the
   GetReservedInstancesExchangeQuote call.

  accept-reserved-instances-exchange-quote-request - Contains the parameters for accepting the quote. - `com.amazonaws.services.ec2.model.AcceptReservedInstancesExchangeQuoteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptReservedInstancesExchangeQuote operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AcceptReservedInstancesExchangeQuoteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AcceptReservedInstancesExchangeQuoteRequest accept-reserved-instances-exchange-quote-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptReservedInstancesExchangeQuoteAsync accept-reserved-instances-exchange-quote-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.AcceptReservedInstancesExchangeQuoteRequest accept-reserved-instances-exchange-quote-request]
    (-> this (.acceptReservedInstancesExchangeQuoteAsync accept-reserved-instances-exchange-quote-request))))

(defn disable-vpc-classic-link-async
  "Disables ClassicLink for a VPC. You cannot disable ClassicLink for a VPC that has EC2-Classic instances linked to
   it.

  disable-vpc-classic-link-request - `com.amazonaws.services.ec2.model.DisableVpcClassicLinkRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableVpcClassicLink operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisableVpcClassicLinkResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisableVpcClassicLinkRequest disable-vpc-classic-link-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableVpcClassicLinkAsync disable-vpc-classic-link-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisableVpcClassicLinkRequest disable-vpc-classic-link-request]
    (-> this (.disableVpcClassicLinkAsync disable-vpc-classic-link-request))))

(defn create-vpc-peering-connection-async
  "Requests a VPC peering connection between two VPCs: a requester VPC that you own and an accepter VPC with which
   to create the connection. The accepter VPC can belong to another AWS account and can be in a different Region to
   the requester VPC. The requester VPC and accepter VPC cannot have overlapping CIDR blocks.



   Limitations and rules apply to a VPC peering connection. For more information, see the limitations section in the VPC Peering Guide.



   The owner of the accepter VPC must accept the peering request to activate the peering connection. The VPC peering
   connection request expires after 7 days, after which it cannot be accepted or rejected.


   If you create a VPC peering connection request between VPCs with overlapping CIDR blocks, the VPC peering
   connection has a status of failed.

  create-vpc-peering-connection-request - `com.amazonaws.services.ec2.model.CreateVpcPeeringConnectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVpcPeeringConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateVpcPeeringConnectionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateVpcPeeringConnectionRequest create-vpc-peering-connection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVpcPeeringConnectionAsync create-vpc-peering-connection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateVpcPeeringConnectionRequest create-vpc-peering-connection-request]
    (-> this (.createVpcPeeringConnectionAsync create-vpc-peering-connection-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.createVpcPeeringConnectionAsync))))

(defn describe-vpc-endpoint-connections-async
  "Describes the VPC endpoint connections to your VPC endpoint services, including any endpoints that are pending
   your acceptance.

  describe-vpc-endpoint-connections-request - `com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcEndpointConnections operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionsRequest describe-vpc-endpoint-connections-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcEndpointConnectionsAsync describe-vpc-endpoint-connections-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionsRequest describe-vpc-endpoint-connections-request]
    (-> this (.describeVpcEndpointConnectionsAsync describe-vpc-endpoint-connections-request))))

(defn disassociate-client-vpn-target-network-async
  "Disassociates a target network from the specified Client VPN endpoint. When you disassociate the last target
   network from a Client VPN, the following happens:




   The route that was automatically added for the VPC is deleted




   All active client connections are terminated




   New client connections are disallowed




   The Client VPN endpoint's status changes to pending-associate

  disassociate-client-vpn-target-network-request - `com.amazonaws.services.ec2.model.DisassociateClientVpnTargetNetworkRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateClientVpnTargetNetwork operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisassociateClientVpnTargetNetworkResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisassociateClientVpnTargetNetworkRequest disassociate-client-vpn-target-network-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateClientVpnTargetNetworkAsync disassociate-client-vpn-target-network-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DisassociateClientVpnTargetNetworkRequest disassociate-client-vpn-target-network-request]
    (-> this (.disassociateClientVpnTargetNetworkAsync disassociate-client-vpn-target-network-request))))

(defn describe-customer-gateways-async
  "Describes one or more of your VPN customer gateways.


   For more information, see AWS Site-to-Site
   VPN in the AWS Site-to-Site VPN User Guide.

  describe-customer-gateways-request - Contains the parameters for DescribeCustomerGateways. - `com.amazonaws.services.ec2.model.DescribeCustomerGatewaysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCustomerGateways operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeCustomerGatewaysResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeCustomerGatewaysRequest describe-customer-gateways-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCustomerGatewaysAsync describe-customer-gateways-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeCustomerGatewaysRequest describe-customer-gateways-request]
    (-> this (.describeCustomerGatewaysAsync describe-customer-gateways-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describeCustomerGatewaysAsync))))

(defn import-client-vpn-client-certificate-revocation-list-async
  "Uploads a client certificate revocation list to the specified Client VPN endpoint. Uploading a client certificate
   revocation list overwrites the existing client certificate revocation list.


   Uploading a client certificate revocation list resets existing client connections.

  import-client-vpn-client-certificate-revocation-list-request - `com.amazonaws.services.ec2.model.ImportClientVpnClientCertificateRevocationListRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportClientVpnClientCertificateRevocationList operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ImportClientVpnClientCertificateRevocationListResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ImportClientVpnClientCertificateRevocationListRequest import-client-vpn-client-certificate-revocation-list-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importClientVpnClientCertificateRevocationListAsync import-client-vpn-client-certificate-revocation-list-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ImportClientVpnClientCertificateRevocationListRequest import-client-vpn-client-certificate-revocation-list-request]
    (-> this (.importClientVpnClientCertificateRevocationListAsync import-client-vpn-client-certificate-revocation-list-request))))

(defn describe-instance-attribute-async
  "Describes the specified attribute of the specified instance. You can specify only one attribute at a time. Valid
   attribute values are: instanceType | kernel | ramdisk |
   userData | disableApiTermination | instanceInitiatedShutdownBehavior |
   rootDeviceName | blockDeviceMapping | productCodes |
   sourceDestCheck | groupSet | ebsOptimized | sriovNetSupport

  describe-instance-attribute-request - `com.amazonaws.services.ec2.model.DescribeInstanceAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstanceAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeInstanceAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeInstanceAttributeRequest describe-instance-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstanceAttributeAsync describe-instance-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeInstanceAttributeRequest describe-instance-attribute-request]
    (-> this (.describeInstanceAttributeAsync describe-instance-attribute-request))))

(defn describe-stale-security-groups-async
  "[VPC only] Describes the stale security group rules for security groups in a specified VPC. Rules are stale when
   they reference a deleted security group in a peer VPC, or a security group in a peer VPC for which the VPC
   peering connection has been deleted.

  describe-stale-security-groups-request - `com.amazonaws.services.ec2.model.DescribeStaleSecurityGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStaleSecurityGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeStaleSecurityGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeStaleSecurityGroupsRequest describe-stale-security-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStaleSecurityGroupsAsync describe-stale-security-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribeStaleSecurityGroupsRequest describe-stale-security-groups-request]
    (-> this (.describeStaleSecurityGroupsAsync describe-stale-security-groups-request))))

(defn provision-byoip-cidr-async
  "Provisions an address range for use with your AWS resources through bring your own IP addresses (BYOIP) and
   creates a corresponding address pool. After the address range is provisioned, it is ready to be advertised using
   AdvertiseByoipCidr.


   AWS verifies that you own the address range and are authorized to advertise it. You must ensure that the address
   range is registered to you and that you created an RPKI ROA to authorize Amazon ASNs 16509 and 14618 to advertise
   the address range. For more information, see Bring Your Own IP Addresses (BYOIP)
   in the Amazon Elastic Compute Cloud User Guide.


   Provisioning an address range is an asynchronous operation, so the call returns immediately, but the address
   range is not ready to use until its status changes from pending-provision to
   provisioned. To monitor the status of an address range, use DescribeByoipCidrs. To allocate
   an Elastic IP address from your address pool, use AllocateAddress with either the specific address from
   the address pool or the ID of the address pool.

  provision-byoip-cidr-request - `com.amazonaws.services.ec2.model.ProvisionByoipCidrRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ProvisionByoipCidr operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ProvisionByoipCidrResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ProvisionByoipCidrRequest provision-byoip-cidr-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.provisionByoipCidrAsync provision-byoip-cidr-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.ProvisionByoipCidrRequest provision-byoip-cidr-request]
    (-> this (.provisionByoipCidrAsync provision-byoip-cidr-request))))

(defn describe-prefix-lists-async
  "Describes available AWS services in a prefix list format, which includes the prefix list name and prefix list ID
   of the service and the IP address range for the service. A prefix list ID is required for creating an outbound
   security group rule that allows traffic from a VPC to access an AWS service through a gateway VPC endpoint.
   Currently, the services that support this action are Amazon S3 and Amazon DynamoDB.

  describe-prefix-lists-request - `com.amazonaws.services.ec2.model.DescribePrefixListsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePrefixLists operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribePrefixListsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribePrefixListsRequest describe-prefix-lists-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePrefixListsAsync describe-prefix-lists-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.DescribePrefixListsRequest describe-prefix-lists-request]
    (-> this (.describePrefixListsAsync describe-prefix-lists-request)))
  (^java.util.concurrent.Future [^AmazonEC2Async this]
    (-> this (.describePrefixListsAsync))))

(defn create-nat-gateway-async
  "Creates a NAT gateway in the specified public subnet. This action creates a network interface in the specified
   subnet with a private IP address from the IP address range of the subnet. Internet-bound traffic from a private
   subnet can be routed to the NAT gateway, therefore enabling instances in the private subnet to connect to the
   internet. For more information, see NAT Gateways in the Amazon
   Virtual Private Cloud User Guide.

  create-nat-gateway-request - `com.amazonaws.services.ec2.model.CreateNatGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNatGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateNatGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateNatGatewayRequest create-nat-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNatGatewayAsync create-nat-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateNatGatewayRequest create-nat-gateway-request]
    (-> this (.createNatGatewayAsync create-nat-gateway-request))))

(defn create-launch-template-async
  "Creates a launch template. A launch template contains the parameters to launch an instance. When you launch an
   instance using RunInstances, you can specify a launch template instead of providing the launch parameters
   in the request.

  create-launch-template-request - `com.amazonaws.services.ec2.model.CreateLaunchTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLaunchTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateLaunchTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateLaunchTemplateRequest create-launch-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLaunchTemplateAsync create-launch-template-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2Async this ^com.amazonaws.services.ec2.model.CreateLaunchTemplateRequest create-launch-template-request]
    (-> this (.createLaunchTemplateAsync create-launch-template-request))))

