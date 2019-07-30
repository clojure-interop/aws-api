(ns com.amazonaws.services.directconnect.AmazonDirectConnectAsync
  "Interface for accessing AWS Direct Connect asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonDirectConnectAsync instead.



  AWS Direct Connect links your internal network to an AWS Direct Connect location over a standard Ethernet fiber-optic
  cable. One end of the cable is connected to your router, the other to an AWS Direct Connect router. With this
  connection in place, you can create virtual interfaces directly to the AWS cloud (for example, to Amazon EC2 and
  Amazon S3) and to Amazon VPC, bypassing Internet service providers in your network path. A connection provides access
  to all AWS Regions except the China (Beijing) and (China) Ningxia Regions. AWS resources in the China Regions can
  only be accessed through locations associated with those Regions."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.directconnect AmazonDirectConnectAsync]))

(defn update-lag-async
  "Updates the attributes of the specified link aggregation group (LAG).


   You can update the following attributes:




   The name of the LAG.




   The value for the minimum number of connections that must be operational for the LAG itself to be operational.




   When you create a LAG, the default value for the minimum number of operational connections is zero (0). If you
   update this value and the number of operational connections falls below the specified value, the LAG
   automatically goes down to avoid over-utilization of the remaining connections. Adjust this value with care, as
   it could force the LAG down if it is set higher than the current number of operational connections.

  update-lag-request - `com.amazonaws.services.directconnect.model.UpdateLagRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateLag operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.UpdateLagResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.UpdateLagRequest update-lag-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateLagAsync update-lag-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.UpdateLagRequest update-lag-request]
    (-> this (.updateLagAsync update-lag-request))))

(defn describe-virtual-gateways-async
  "Lists the virtual private gateways owned by the AWS account.


   You can create one or more AWS Direct Connect private virtual interfaces linked to a virtual private gateway.

  describe-virtual-gateways-request - `com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVirtualGateways operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysRequest describe-virtual-gateways-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVirtualGatewaysAsync describe-virtual-gateways-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysRequest describe-virtual-gateways-request]
    (-> this (.describeVirtualGatewaysAsync describe-virtual-gateways-request)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this]
    (-> this (.describeVirtualGatewaysAsync))))

(defn untag-resource-async
  "Removes one or more tags from the specified AWS Direct Connect resource.

  untag-resource-request - `com.amazonaws.services.directconnect.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn update-virtual-interface-attributes-async
  "Updates the specified attributes of the specified virtual private interface.


   Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause an update to the underlying physical
   connection if it wasn't updated to support jumbo frames. Updating the connection disrupts network connectivity
   for all virtual interfaces associated with the connection for up to 30 seconds. To check whether your connection
   supports jumbo frames, call DescribeConnections. To check whether your virtual interface supports jumbo
   frames, call DescribeVirtualInterfaces.

  update-virtual-interface-attributes-request - `com.amazonaws.services.directconnect.model.UpdateVirtualInterfaceAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateVirtualInterfaceAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.UpdateVirtualInterfaceAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.UpdateVirtualInterfaceAttributesRequest update-virtual-interface-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateVirtualInterfaceAttributesAsync update-virtual-interface-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.UpdateVirtualInterfaceAttributesRequest update-virtual-interface-attributes-request]
    (-> this (.updateVirtualInterfaceAttributesAsync update-virtual-interface-attributes-request))))

(defn delete-direct-connect-gateway-association-async
  "Deletes the association between the specified Direct Connect gateway and virtual private gateway.

  delete-direct-connect-gateway-association-request - `com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDirectConnectGatewayAssociation operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationRequest delete-direct-connect-gateway-association-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDirectConnectGatewayAssociationAsync delete-direct-connect-gateway-association-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationRequest delete-direct-connect-gateway-association-request]
    (-> this (.deleteDirectConnectGatewayAssociationAsync delete-direct-connect-gateway-association-request))))

(defn create-lag-async
  "Creates a link aggregation group (LAG) with the specified number of bundled physical connections between the
   customer network and a specific AWS Direct Connect location. A LAG is a logical interface that uses the Link
   Aggregation Control Protocol (LACP) to aggregate multiple interfaces, enabling you to treat them as a single
   interface.


   All connections in a LAG must use the same bandwidth and must terminate at the same AWS Direct Connect endpoint.


   You can have up to 10 connections per LAG. Regardless of this limit, if you request more connections for the LAG
   than AWS Direct Connect can allocate on a single endpoint, no LAG is created.


   You can specify an existing physical connection or interconnect to include in the LAG (which counts towards the
   total number of connections). Doing so interrupts the current physical connection or hosted connections, and
   re-establishes them as a member of the LAG. The LAG will be created on the same AWS Direct Connect endpoint to
   which the connection terminates. Any virtual interfaces associated with the connection are automatically
   disassociated and re-associated with the LAG. The connection ID does not change.


   If the AWS account used to create a LAG is a registered AWS Direct Connect Partner, the LAG is automatically
   enabled to host sub-connections. For a LAG owned by a partner, any associated virtual interfaces cannot be
   directly configured.

  create-lag-request - `com.amazonaws.services.directconnect.model.CreateLagRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLag operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.CreateLagResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateLagRequest create-lag-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLagAsync create-lag-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateLagRequest create-lag-request]
    (-> this (.createLagAsync create-lag-request))))

(defn delete-direct-connect-gateway-async
  "Deletes the specified Direct Connect gateway. You must first delete all virtual interfaces that are attached to
   the Direct Connect gateway and disassociate all virtual private gateways that are associated with the Direct
   Connect gateway.

  delete-direct-connect-gateway-request - `com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDirectConnectGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayRequest delete-direct-connect-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDirectConnectGatewayAsync delete-direct-connect-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayRequest delete-direct-connect-gateway-request]
    (-> this (.deleteDirectConnectGatewayAsync delete-direct-connect-gateway-request))))

(defn confirm-private-virtual-interface-async
  "Accepts ownership of a private virtual interface created by another AWS account.


   After the virtual interface owner makes this call, the virtual interface is created and attached to the specified
   virtual private gateway or Direct Connect gateway, and is made available to handle traffic.

  confirm-private-virtual-interface-request - `com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ConfirmPrivateVirtualInterface operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceRequest confirm-private-virtual-interface-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.confirmPrivateVirtualInterfaceAsync confirm-private-virtual-interface-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceRequest confirm-private-virtual-interface-request]
    (-> this (.confirmPrivateVirtualInterfaceAsync confirm-private-virtual-interface-request))))

(defn delete-lag-async
  "Deletes the specified link aggregation group (LAG). You cannot delete a LAG if it has active virtual interfaces
   or hosted connections.

  delete-lag-request - `com.amazonaws.services.directconnect.model.DeleteLagRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLag operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DeleteLagResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteLagRequest delete-lag-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLagAsync delete-lag-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteLagRequest delete-lag-request]
    (-> this (.deleteLagAsync delete-lag-request))))

(defn accept-direct-connect-gateway-association-proposal-async
  "Accepts a proposal request to attach a virtual private gateway or transit gateway to a Direct Connect gateway.

  accept-direct-connect-gateway-association-proposal-request - `com.amazonaws.services.directconnect.model.AcceptDirectConnectGatewayAssociationProposalRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptDirectConnectGatewayAssociationProposal operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.AcceptDirectConnectGatewayAssociationProposalResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AcceptDirectConnectGatewayAssociationProposalRequest accept-direct-connect-gateway-association-proposal-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptDirectConnectGatewayAssociationProposalAsync accept-direct-connect-gateway-association-proposal-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AcceptDirectConnectGatewayAssociationProposalRequest accept-direct-connect-gateway-association-proposal-request]
    (-> this (.acceptDirectConnectGatewayAssociationProposalAsync accept-direct-connect-gateway-association-proposal-request))))

(defn allocate-private-virtual-interface-async
  "Provisions a private virtual interface to be owned by the specified AWS account.


   Virtual interfaces created using this action must be confirmed by the owner using
   ConfirmPrivateVirtualInterface. Until then, the virtual interface is in the Confirming state
   and is not available to handle traffic.

  allocate-private-virtual-interface-request - `com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AllocatePrivateVirtualInterface operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceRequest allocate-private-virtual-interface-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.allocatePrivateVirtualInterfaceAsync allocate-private-virtual-interface-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceRequest allocate-private-virtual-interface-request]
    (-> this (.allocatePrivateVirtualInterfaceAsync allocate-private-virtual-interface-request))))

(defn create-direct-connect-gateway-async
  "Creates a Direct Connect gateway, which is an intermediate object that enables you to connect a set of virtual
   interfaces and virtual private gateways. A Direct Connect gateway is global and visible in any AWS Region after
   it is created. The virtual interfaces and virtual private gateways that are connected through a Direct Connect
   gateway can be in different AWS Regions. This enables you to connect to a VPC in any Region, regardless of the
   Region in which the virtual interfaces are located, and pass traffic between them.

  create-direct-connect-gateway-request - `com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDirectConnectGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayRequest create-direct-connect-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDirectConnectGatewayAsync create-direct-connect-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayRequest create-direct-connect-gateway-request]
    (-> this (.createDirectConnectGatewayAsync create-direct-connect-gateway-request))))

(defn describe-direct-connect-gateway-association-proposals-async
  "Describes one or more association proposals for connection between a virtual private gateway or transit gateway
   and a Direct Connect gateway.

  describe-direct-connect-gateway-association-proposals-request - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationProposalsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDirectConnectGatewayAssociationProposals operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationProposalsResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationProposalsRequest describe-direct-connect-gateway-association-proposals-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDirectConnectGatewayAssociationProposalsAsync describe-direct-connect-gateway-association-proposals-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationProposalsRequest describe-direct-connect-gateway-association-proposals-request]
    (-> this (.describeDirectConnectGatewayAssociationProposalsAsync describe-direct-connect-gateway-association-proposals-request))))

(defn describe-virtual-interfaces-async
  "Displays all virtual interfaces for an AWS account. Virtual interfaces deleted fewer than 15 minutes before you
   make the request are also returned. If you specify a connection ID, only the virtual interfaces associated with
   the connection are returned. If you specify a virtual interface ID, then only a single virtual interface is
   returned.


   A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer
   network.

  describe-virtual-interfaces-request - `com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVirtualInterfaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesRequest describe-virtual-interfaces-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVirtualInterfacesAsync describe-virtual-interfaces-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesRequest describe-virtual-interfaces-request]
    (-> this (.describeVirtualInterfacesAsync describe-virtual-interfaces-request)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this]
    (-> this (.describeVirtualInterfacesAsync))))

(defn describe-lags-async
  "Describes all your link aggregation groups (LAG) or the specified LAG.

  describe-lags-request - `com.amazonaws.services.directconnect.model.DescribeLagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeLagsResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeLagsRequest describe-lags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLagsAsync describe-lags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeLagsRequest describe-lags-request]
    (-> this (.describeLagsAsync describe-lags-request))))

(defn confirm-public-virtual-interface-async
  "Accepts ownership of a public virtual interface created by another AWS account.


   After the virtual interface owner makes this call, the specified virtual interface is created and made available
   to handle traffic.

  confirm-public-virtual-interface-request - `com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ConfirmPublicVirtualInterface operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceRequest confirm-public-virtual-interface-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.confirmPublicVirtualInterfaceAsync confirm-public-virtual-interface-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceRequest confirm-public-virtual-interface-request]
    (-> this (.confirmPublicVirtualInterfaceAsync confirm-public-virtual-interface-request))))

(defn describe-direct-connect-gateway-attachments-async
  "Lists the attachments between your Direct Connect gateways and virtual interfaces. You must specify a Direct
   Connect gateway, a virtual interface, or both. If you specify a Direct Connect gateway, the response contains all
   virtual interfaces attached to the Direct Connect gateway. If you specify a virtual interface, the response
   contains all Direct Connect gateways attached to the virtual interface. If you specify both, the response
   contains the attachment between the Direct Connect gateway and the virtual interface.

  describe-direct-connect-gateway-attachments-request - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDirectConnectGatewayAttachments operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsRequest describe-direct-connect-gateway-attachments-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDirectConnectGatewayAttachmentsAsync describe-direct-connect-gateway-attachments-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsRequest describe-direct-connect-gateway-attachments-request]
    (-> this (.describeDirectConnectGatewayAttachmentsAsync describe-direct-connect-gateway-attachments-request))))

(defn describe-loa-async
  "Gets the LOA-CFA for a connection, interconnect, or link aggregation group (LAG).


   The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when
   establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at
   AWS Direct Connect Locations in the AWS Direct Connect User Guide.

  describe-loa-request - `com.amazonaws.services.directconnect.model.DescribeLoaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoa operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeLoaResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeLoaRequest describe-loa-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoaAsync describe-loa-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeLoaRequest describe-loa-request]
    (-> this (.describeLoaAsync describe-loa-request))))

(defn create-direct-connect-gateway-association-async
  "Creates an association between a Direct Connect gateway and a virtual private gateway. The virtual private
   gateway must be attached to a VPC and must not be associated with another Direct Connect gateway.

  create-direct-connect-gateway-association-request - `com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDirectConnectGatewayAssociation operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationRequest create-direct-connect-gateway-association-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDirectConnectGatewayAssociationAsync create-direct-connect-gateway-association-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationRequest create-direct-connect-gateway-association-request]
    (-> this (.createDirectConnectGatewayAssociationAsync create-direct-connect-gateway-association-request))))

(defn create-interconnect-async
  "Creates an interconnect between an AWS Direct Connect Partner's network and a specific AWS Direct Connect
   location.


   An interconnect is a connection that is capable of hosting other connections. The AWS Direct Connect partner can
   use an interconnect to provide AWS Direct Connect hosted connections to customers through their own network
   services. Like a standard connection, an interconnect links the partner's network to an AWS Direct Connect
   location over a standard Ethernet fiber-optic cable. One end is connected to the partner's router, the other to
   an AWS Direct Connect router.


   You can automatically add the new interconnect to a link aggregation group (LAG) by specifying a LAG ID in the
   request. This ensures that the new interconnect is allocated on the same AWS Direct Connect endpoint that hosts
   the specified LAG. If there are no available ports on the endpoint, the request fails and no interconnect is
   created.


   For each end customer, the AWS Direct Connect Partner provisions a connection on their interconnect by calling
   AllocateHostedConnection. The end customer can then connect to AWS resources by creating a virtual
   interface on their connection, using the VLAN assigned to them by the AWS Direct Connect Partner.



   Intended for use by AWS Direct Connect Partners only.

  create-interconnect-request - `com.amazonaws.services.directconnect.model.CreateInterconnectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInterconnect operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.CreateInterconnectResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateInterconnectRequest create-interconnect-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInterconnectAsync create-interconnect-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateInterconnectRequest create-interconnect-request]
    (-> this (.createInterconnectAsync create-interconnect-request))))

(defn delete-connection-async
  "Deletes the specified connection.


   Deleting a connection only stops the AWS Direct Connect port hour and data transfer charges. If you are
   partnering with any third parties to connect with the AWS Direct Connect location, you must cancel your service
   with them separately.

  delete-connection-request - `com.amazonaws.services.directconnect.model.DeleteConnectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DeleteConnectionResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteConnectionRequest delete-connection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConnectionAsync delete-connection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteConnectionRequest delete-connection-request]
    (-> this (.deleteConnectionAsync delete-connection-request))))

(defn create-public-virtual-interface-async
  "Creates a public virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A
   public virtual interface supports sending traffic to public services of AWS such as Amazon S3.


   When creating an IPv6 public virtual interface (addressFamily is ipv6), leave the
   customer and amazon address fields blank to use auto-assigned IPv6 space. Custom IPv6
   addresses are not supported.

  create-public-virtual-interface-request - `com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePublicVirtualInterface operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceRequest create-public-virtual-interface-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPublicVirtualInterfaceAsync create-public-virtual-interface-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceRequest create-public-virtual-interface-request]
    (-> this (.createPublicVirtualInterfaceAsync create-public-virtual-interface-request))))

(defn associate-connection-with-lag-async
  "Associates an existing connection with a link aggregation group (LAG). The connection is interrupted and
   re-established as a member of the LAG (connectivity to AWS is interrupted). The connection must be hosted on the
   same AWS Direct Connect endpoint as the LAG, and its bandwidth must match the bandwidth for the LAG. You can
   re-associate a connection that's currently associated with a different LAG; however, if removing the connection
   would cause the original LAG to fall below its setting for minimum number of operational connections, the request
   fails.


   Any virtual interfaces that are directly associated with the connection are automatically re-associated with the
   LAG. If the connection was originally associated with a different LAG, the virtual interfaces remain associated
   with the original LAG.


   For interconnects, any hosted connections are automatically re-associated with the LAG. If the interconnect was
   originally associated with a different LAG, the hosted connections remain associated with the original LAG.

  associate-connection-with-lag-request - `com.amazonaws.services.directconnect.model.AssociateConnectionWithLagRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateConnectionWithLag operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.AssociateConnectionWithLagResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AssociateConnectionWithLagRequest associate-connection-with-lag-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateConnectionWithLagAsync associate-connection-with-lag-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AssociateConnectionWithLagRequest associate-connection-with-lag-request]
    (-> this (.associateConnectionWithLagAsync associate-connection-with-lag-request))))

(defn allocate-public-virtual-interface-async
  "Provisions a public virtual interface to be owned by the specified AWS account.


   The owner of a connection calls this function to provision a public virtual interface to be owned by the
   specified AWS account.


   Virtual interfaces created using this function must be confirmed by the owner using
   ConfirmPublicVirtualInterface. Until this step has been completed, the virtual interface is in the
   confirming state and is not available to handle traffic.


   When creating an IPv6 public virtual interface, omit the Amazon address and customer address. IPv6 addresses are
   automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses.

  allocate-public-virtual-interface-request - `com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AllocatePublicVirtualInterface operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceRequest allocate-public-virtual-interface-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.allocatePublicVirtualInterfaceAsync allocate-public-virtual-interface-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceRequest allocate-public-virtual-interface-request]
    (-> this (.allocatePublicVirtualInterfaceAsync allocate-public-virtual-interface-request))))

(defn create-direct-connect-gateway-association-proposal-async
  "Creates a proposal to associate the specified virtual private gateway or transit gateway with the specified
   Direct Connect gateway.


   You can only associate a Direct Connect gateway and virtual private gateway or transit gateway when the account
   that owns the Direct Connect gateway and the account that owns the virtual private gateway or transit gateway
   have the same AWS Payer ID.

  create-direct-connect-gateway-association-proposal-request - `com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationProposalRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDirectConnectGatewayAssociationProposal operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationProposalResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationProposalRequest create-direct-connect-gateway-association-proposal-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDirectConnectGatewayAssociationProposalAsync create-direct-connect-gateway-association-proposal-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationProposalRequest create-direct-connect-gateway-association-proposal-request]
    (-> this (.createDirectConnectGatewayAssociationProposalAsync create-direct-connect-gateway-association-proposal-request))))

(defn create-private-virtual-interface-async
  "Creates a private virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic.
   A private virtual interface can be connected to either a Direct Connect gateway or a Virtual Private Gateway
   (VGW). Connecting the private virtual interface to a Direct Connect gateway enables the possibility for
   connecting to multiple VPCs, including VPCs in different AWS Regions. Connecting the private virtual interface to
   a VGW only provides access to a single VPC within the same Region.

  create-private-virtual-interface-request - `com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePrivateVirtualInterface operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceRequest create-private-virtual-interface-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPrivateVirtualInterfaceAsync create-private-virtual-interface-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceRequest create-private-virtual-interface-request]
    (-> this (.createPrivateVirtualInterfaceAsync create-private-virtual-interface-request))))

(defn describe-interconnect-loa-async
  "Deprecated.

  describe-interconnect-loa-request - `com.amazonaws.services.directconnect.model.DescribeInterconnectLoaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInterconnectLoa operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeInterconnectLoaResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeInterconnectLoaRequest describe-interconnect-loa-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInterconnectLoaAsync describe-interconnect-loa-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeInterconnectLoaRequest describe-interconnect-loa-request]
    (-> this (.describeInterconnectLoaAsync describe-interconnect-loa-request))))

(defn create-bgp-peer-async
  "Creates a BGP peer on the specified virtual interface.


   You must create a BGP peer for the corresponding address family (IPv4/IPv6) in order to access AWS resources that
   also use that address family.


   If logical redundancy is not supported by the connection, interconnect, or LAG, the BGP peer cannot be in the
   same address family as an existing BGP peer on the virtual interface.


   When creating a IPv6 BGP peer, omit the Amazon address and customer address. IPv6 addresses are automatically
   assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses.


   For a public virtual interface, the Autonomous System Number (ASN) must be private or already whitelisted for the
   virtual interface.

  create-bgp-peer-request - `com.amazonaws.services.directconnect.model.CreateBGPPeerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBGPPeer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.CreateBGPPeerResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateBGPPeerRequest create-bgp-peer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBGPPeerAsync create-bgp-peer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateBGPPeerRequest create-bgp-peer-request]
    (-> this (.createBGPPeerAsync create-bgp-peer-request))))

(defn describe-connections-on-interconnect-async
  "Deprecated.

  describe-connections-on-interconnect-request - `com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConnectionsOnInterconnect operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectRequest describe-connections-on-interconnect-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConnectionsOnInterconnectAsync describe-connections-on-interconnect-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectRequest describe-connections-on-interconnect-request]
    (-> this (.describeConnectionsOnInterconnectAsync describe-connections-on-interconnect-request))))

(defn delete-interconnect-async
  "Deletes the specified interconnect.



   Intended for use by AWS Direct Connect Partners only.

  delete-interconnect-request - `com.amazonaws.services.directconnect.model.DeleteInterconnectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInterconnect operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DeleteInterconnectResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteInterconnectRequest delete-interconnect-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInterconnectAsync delete-interconnect-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteInterconnectRequest delete-interconnect-request]
    (-> this (.deleteInterconnectAsync delete-interconnect-request))))

(defn associate-hosted-connection-async
  "Associates a hosted connection and its virtual interfaces with a link aggregation group (LAG) or interconnect. If
   the target interconnect or LAG has an existing hosted connection with a conflicting VLAN number or IP address,
   the operation fails. This action temporarily interrupts the hosted connection's connectivity to AWS as it is
   being migrated.



   Intended for use by AWS Direct Connect Partners only.

  associate-hosted-connection-request - `com.amazonaws.services.directconnect.model.AssociateHostedConnectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateHostedConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.AssociateHostedConnectionResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AssociateHostedConnectionRequest associate-hosted-connection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateHostedConnectionAsync associate-hosted-connection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AssociateHostedConnectionRequest associate-hosted-connection-request]
    (-> this (.associateHostedConnectionAsync associate-hosted-connection-request))))

(defn confirm-connection-async
  "Confirms the creation of the specified hosted connection on an interconnect.


   Upon creation, the hosted connection is initially in the Ordering state, and remains in this state
   until the owner confirms creation of the hosted connection.

  confirm-connection-request - `com.amazonaws.services.directconnect.model.ConfirmConnectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ConfirmConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.ConfirmConnectionResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.ConfirmConnectionRequest confirm-connection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.confirmConnectionAsync confirm-connection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.ConfirmConnectionRequest confirm-connection-request]
    (-> this (.confirmConnectionAsync confirm-connection-request))))

(defn allocate-hosted-connection-async
  "Creates a hosted connection on the specified interconnect or a link aggregation group (LAG) of interconnects.


   Allocates a VLAN number and a specified amount of capacity (bandwidth) for use by a hosted connection on the
   specified interconnect or LAG of interconnects. AWS polices the hosted connection for the specified capacity and
   the AWS Direct Connect Partner must also police the hosted connection for the specified capacity.



   Intended for use by AWS Direct Connect Partners only.

  allocate-hosted-connection-request - `com.amazonaws.services.directconnect.model.AllocateHostedConnectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AllocateHostedConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.AllocateHostedConnectionResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AllocateHostedConnectionRequest allocate-hosted-connection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.allocateHostedConnectionAsync allocate-hosted-connection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AllocateHostedConnectionRequest allocate-hosted-connection-request]
    (-> this (.allocateHostedConnectionAsync allocate-hosted-connection-request))))

(defn describe-connection-loa-async
  "Deprecated.

  describe-connection-loa-request - `com.amazonaws.services.directconnect.model.DescribeConnectionLoaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConnectionLoa operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeConnectionLoaResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeConnectionLoaRequest describe-connection-loa-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConnectionLoaAsync describe-connection-loa-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeConnectionLoaRequest describe-connection-loa-request]
    (-> this (.describeConnectionLoaAsync describe-connection-loa-request))))

(defn disassociate-connection-from-lag-async
  "Disassociates a connection from a link aggregation group (LAG). The connection is interrupted and re-established
   as a standalone connection (the connection is not deleted; to delete the connection, use the
   DeleteConnection request). If the LAG has associated virtual interfaces or hosted connections, they remain
   associated with the LAG. A disassociated connection owned by an AWS Direct Connect Partner is automatically
   converted to an interconnect.


   If disassociating the connection would cause the LAG to fall below its setting for minimum number of operational
   connections, the request fails, except when it's the last member of the LAG. If all connections are
   disassociated, the LAG continues to exist as an empty LAG with no physical connections.

  disassociate-connection-from-lag-request - `com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateConnectionFromLag operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagRequest disassociate-connection-from-lag-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateConnectionFromLagAsync disassociate-connection-from-lag-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagRequest disassociate-connection-from-lag-request]
    (-> this (.disassociateConnectionFromLagAsync disassociate-connection-from-lag-request))))

(defn describe-connections-async
  "Displays the specified connection or all connections in this Region.

  describe-connections-request - `com.amazonaws.services.directconnect.model.DescribeConnectionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConnections operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeConnectionsResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeConnectionsRequest describe-connections-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConnectionsAsync describe-connections-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeConnectionsRequest describe-connections-request]
    (-> this (.describeConnectionsAsync describe-connections-request)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this]
    (-> this (.describeConnectionsAsync))))

(defn delete-bgp-peer-async
  "Deletes the specified BGP peer on the specified virtual interface with the specified customer address and ASN.


   You cannot delete the last BGP peer from a virtual interface.

  delete-bgp-peer-request - `com.amazonaws.services.directconnect.model.DeleteBGPPeerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBGPPeer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DeleteBGPPeerResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteBGPPeerRequest delete-bgp-peer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBGPPeerAsync delete-bgp-peer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteBGPPeerRequest delete-bgp-peer-request]
    (-> this (.deleteBGPPeerAsync delete-bgp-peer-request))))

(defn allocate-transit-virtual-interface-async
  "Provisions a transit virtual interface to be owned by the specified AWS account. Use this type of interface to
   connect a transit gateway to your Direct Connect gateway.


   The owner of a connection provisions a transit virtual interface to be owned by the specified AWS account.


   After you create a transit virtual interface, it must be confirmed by the owner using
   ConfirmTransitVirtualInterface. Until this step has been completed, the transit virtual interface is in
   the requested state and is not available to handle traffic.

  allocate-transit-virtual-interface-request - `com.amazonaws.services.directconnect.model.AllocateTransitVirtualInterfaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AllocateTransitVirtualInterface operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.AllocateTransitVirtualInterfaceResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AllocateTransitVirtualInterfaceRequest allocate-transit-virtual-interface-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.allocateTransitVirtualInterfaceAsync allocate-transit-virtual-interface-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AllocateTransitVirtualInterfaceRequest allocate-transit-virtual-interface-request]
    (-> this (.allocateTransitVirtualInterfaceAsync allocate-transit-virtual-interface-request))))

(defn describe-tags-async
  "Describes the tags associated with the specified AWS Direct Connect resources.

  describe-tags-request - `com.amazonaws.services.directconnect.model.DescribeTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeTagsResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeTagsRequest describe-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTagsAsync describe-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeTagsRequest describe-tags-request]
    (-> this (.describeTagsAsync describe-tags-request))))

(defn describe-locations-async
  "Lists the AWS Direct Connect locations in the current AWS Region. These are the locations that can be selected
   when calling CreateConnection or CreateInterconnect.

  describe-locations-request - `com.amazonaws.services.directconnect.model.DescribeLocationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLocations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeLocationsResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeLocationsRequest describe-locations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLocationsAsync describe-locations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeLocationsRequest describe-locations-request]
    (-> this (.describeLocationsAsync describe-locations-request)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this]
    (-> this (.describeLocationsAsync))))

(defn confirm-transit-virtual-interface-async
  "Accepts ownership of a transit virtual interface created by another AWS account.


   After the owner of the transit virtual interface makes this call, the specified transit virtual interface is
   created and made available to handle traffic.

  confirm-transit-virtual-interface-request - `com.amazonaws.services.directconnect.model.ConfirmTransitVirtualInterfaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ConfirmTransitVirtualInterface operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.ConfirmTransitVirtualInterfaceResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.ConfirmTransitVirtualInterfaceRequest confirm-transit-virtual-interface-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.confirmTransitVirtualInterfaceAsync confirm-transit-virtual-interface-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.ConfirmTransitVirtualInterfaceRequest confirm-transit-virtual-interface-request]
    (-> this (.confirmTransitVirtualInterfaceAsync confirm-transit-virtual-interface-request))))

(defn create-connection-async
  "Creates a connection between a customer network and a specific AWS Direct Connect location.


   A connection links your internal network to an AWS Direct Connect location over a standard Ethernet fiber-optic
   cable. One end of the cable is connected to your router, the other to an AWS Direct Connect router.


   To find the locations for your Region, use DescribeLocations.


   You can automatically add the new connection to a link aggregation group (LAG) by specifying a LAG ID in the
   request. This ensures that the new connection is allocated on the same AWS Direct Connect endpoint that hosts the
   specified LAG. If there are no available ports on the endpoint, the request fails and no connection is created.

  create-connection-request - `com.amazonaws.services.directconnect.model.CreateConnectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.CreateConnectionResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateConnectionRequest create-connection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConnectionAsync create-connection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateConnectionRequest create-connection-request]
    (-> this (.createConnectionAsync create-connection-request))))

(defn describe-hosted-connections-async
  "Lists the hosted connections that have been provisioned on the specified interconnect or link aggregation group
   (LAG).



   Intended for use by AWS Direct Connect Partners only.

  describe-hosted-connections-request - `com.amazonaws.services.directconnect.model.DescribeHostedConnectionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeHostedConnections operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeHostedConnectionsResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeHostedConnectionsRequest describe-hosted-connections-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeHostedConnectionsAsync describe-hosted-connections-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeHostedConnectionsRequest describe-hosted-connections-request]
    (-> this (.describeHostedConnectionsAsync describe-hosted-connections-request))))

(defn describe-direct-connect-gateway-associations-async
  "Lists the associations between your Direct Connect gateways and virtual private gateways. You must specify a
   Direct Connect gateway, a virtual private gateway, or both. If you specify a Direct Connect gateway, the response
   contains all virtual private gateways associated with the Direct Connect gateway. If you specify a virtual
   private gateway, the response contains all Direct Connect gateways associated with the virtual private gateway.
   If you specify both, the response contains the association between the Direct Connect gateway and the virtual
   private gateway.

  describe-direct-connect-gateway-associations-request - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDirectConnectGatewayAssociations operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsRequest describe-direct-connect-gateway-associations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDirectConnectGatewayAssociationsAsync describe-direct-connect-gateway-associations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsRequest describe-direct-connect-gateway-associations-request]
    (-> this (.describeDirectConnectGatewayAssociationsAsync describe-direct-connect-gateway-associations-request))))

(defn associate-virtual-interface-async
  "Associates a virtual interface with a specified link aggregation group (LAG) or connection. Connectivity to AWS
   is temporarily interrupted as the virtual interface is being migrated. If the target connection or LAG has an
   associated virtual interface with a conflicting VLAN number or a conflicting IP address, the operation fails.


   Virtual interfaces associated with a hosted connection cannot be associated with a LAG; hosted connections must
   be migrated along with their virtual interfaces using AssociateHostedConnection.


   To reassociate a virtual interface to a new connection or LAG, the requester must own either the virtual
   interface itself or the connection to which the virtual interface is currently associated. Additionally, the
   requester must own the connection or LAG for the association.

  associate-virtual-interface-request - `com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateVirtualInterface operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceRequest associate-virtual-interface-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateVirtualInterfaceAsync associate-virtual-interface-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceRequest associate-virtual-interface-request]
    (-> this (.associateVirtualInterfaceAsync associate-virtual-interface-request))))

(defn describe-interconnects-async
  "Lists the interconnects owned by the AWS account or only the specified interconnect.

  describe-interconnects-request - `com.amazonaws.services.directconnect.model.DescribeInterconnectsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInterconnects operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeInterconnectsResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeInterconnectsRequest describe-interconnects-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInterconnectsAsync describe-interconnects-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeInterconnectsRequest describe-interconnects-request]
    (-> this (.describeInterconnectsAsync describe-interconnects-request)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this]
    (-> this (.describeInterconnectsAsync))))

(defn tag-resource-async
  "Adds the specified tags to the specified AWS Direct Connect resource. Each resource can have a maximum of 50
   tags.


   Each tag consists of a key and an optional value. If a tag with the same key is already associated with the
   resource, this action updates its value.

  tag-resource-request - `com.amazonaws.services.directconnect.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn create-transit-virtual-interface-async
  "Creates a transit virtual interface. A transit virtual interface should be used to access one or more transit
   gateways associated with Direct Connect gateways. A transit virtual interface enables the connection of multiple
   VPCs attached to a transit gateway to a Direct Connect gateway.



   If you associate your transit gateway with one or more Direct Connect gateways, the Autonomous System Number
   (ASN) used by the transit gateway and the Direct Connect gateway must be different. For example, if you use the
   default ASN 64512 for both your the transit gateway and Direct Connect gateway, the association request fails.

  create-transit-virtual-interface-request - `com.amazonaws.services.directconnect.model.CreateTransitVirtualInterfaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTransitVirtualInterface operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.CreateTransitVirtualInterfaceResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateTransitVirtualInterfaceRequest create-transit-virtual-interface-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTransitVirtualInterfaceAsync create-transit-virtual-interface-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateTransitVirtualInterfaceRequest create-transit-virtual-interface-request]
    (-> this (.createTransitVirtualInterfaceAsync create-transit-virtual-interface-request))))

(defn allocate-connection-on-interconnect-async
  "Deprecated.

  allocate-connection-on-interconnect-request - `com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AllocateConnectionOnInterconnect operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectRequest allocate-connection-on-interconnect-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.allocateConnectionOnInterconnectAsync allocate-connection-on-interconnect-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectRequest allocate-connection-on-interconnect-request]
    (-> this (.allocateConnectionOnInterconnectAsync allocate-connection-on-interconnect-request))))

(defn delete-virtual-interface-async
  "Deletes a virtual interface.

  delete-virtual-interface-request - `com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVirtualInterface operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceRequest delete-virtual-interface-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVirtualInterfaceAsync delete-virtual-interface-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceRequest delete-virtual-interface-request]
    (-> this (.deleteVirtualInterfaceAsync delete-virtual-interface-request))))

(defn update-direct-connect-gateway-association-async
  "Updates the specified attributes of the Direct Connect gateway association.


   Add or remove prefixes from the association.

  update-direct-connect-gateway-association-request - `com.amazonaws.services.directconnect.model.UpdateDirectConnectGatewayAssociationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDirectConnectGatewayAssociation operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.UpdateDirectConnectGatewayAssociationResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.UpdateDirectConnectGatewayAssociationRequest update-direct-connect-gateway-association-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDirectConnectGatewayAssociationAsync update-direct-connect-gateway-association-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.UpdateDirectConnectGatewayAssociationRequest update-direct-connect-gateway-association-request]
    (-> this (.updateDirectConnectGatewayAssociationAsync update-direct-connect-gateway-association-request))))

(defn delete-direct-connect-gateway-association-proposal-async
  "Deletes the association proposal request between the specified Direct Connect gateway and virtual private gateway
   or transit gateway.

  delete-direct-connect-gateway-association-proposal-request - `com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationProposalRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDirectConnectGatewayAssociationProposal operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationProposalResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationProposalRequest delete-direct-connect-gateway-association-proposal-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDirectConnectGatewayAssociationProposalAsync delete-direct-connect-gateway-association-proposal-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationProposalRequest delete-direct-connect-gateway-association-proposal-request]
    (-> this (.deleteDirectConnectGatewayAssociationProposalAsync delete-direct-connect-gateway-association-proposal-request))))

(defn describe-direct-connect-gateways-async
  "Lists all your Direct Connect gateways or only the specified Direct Connect gateway. Deleted Direct Connect
   gateways are not returned.

  describe-direct-connect-gateways-request - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDirectConnectGateways operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysResult>`"
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysRequest describe-direct-connect-gateways-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDirectConnectGatewaysAsync describe-direct-connect-gateways-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysRequest describe-direct-connect-gateways-request]
    (-> this (.describeDirectConnectGatewaysAsync describe-direct-connect-gateways-request))))

