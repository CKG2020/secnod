# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.8

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/share/clion/bin/cmake/bin/cmake

# The command to remove a file.
RM = /usr/share/clion/bin/cmake/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/ckg/secnod/secnod/CppTest

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/ckg/secnod/secnod/CppTest/cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/CppTest.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/CppTest.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/CppTest.dir/flags.make

CMakeFiles/CppTest.dir/main.cpp.o: CMakeFiles/CppTest.dir/flags.make
CMakeFiles/CppTest.dir/main.cpp.o: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/ckg/secnod/secnod/CppTest/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/CppTest.dir/main.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/CppTest.dir/main.cpp.o -c /home/ckg/secnod/secnod/CppTest/main.cpp

CMakeFiles/CppTest.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/CppTest.dir/main.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/ckg/secnod/secnod/CppTest/main.cpp > CMakeFiles/CppTest.dir/main.cpp.i

CMakeFiles/CppTest.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/CppTest.dir/main.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/ckg/secnod/secnod/CppTest/main.cpp -o CMakeFiles/CppTest.dir/main.cpp.s

CMakeFiles/CppTest.dir/main.cpp.o.requires:

.PHONY : CMakeFiles/CppTest.dir/main.cpp.o.requires

CMakeFiles/CppTest.dir/main.cpp.o.provides: CMakeFiles/CppTest.dir/main.cpp.o.requires
	$(MAKE) -f CMakeFiles/CppTest.dir/build.make CMakeFiles/CppTest.dir/main.cpp.o.provides.build
.PHONY : CMakeFiles/CppTest.dir/main.cpp.o.provides

CMakeFiles/CppTest.dir/main.cpp.o.provides.build: CMakeFiles/CppTest.dir/main.cpp.o


CMakeFiles/CppTest.dir/Father.cpp.o: CMakeFiles/CppTest.dir/flags.make
CMakeFiles/CppTest.dir/Father.cpp.o: ../Father.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/ckg/secnod/secnod/CppTest/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Building CXX object CMakeFiles/CppTest.dir/Father.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/CppTest.dir/Father.cpp.o -c /home/ckg/secnod/secnod/CppTest/Father.cpp

CMakeFiles/CppTest.dir/Father.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/CppTest.dir/Father.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/ckg/secnod/secnod/CppTest/Father.cpp > CMakeFiles/CppTest.dir/Father.cpp.i

CMakeFiles/CppTest.dir/Father.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/CppTest.dir/Father.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/ckg/secnod/secnod/CppTest/Father.cpp -o CMakeFiles/CppTest.dir/Father.cpp.s

CMakeFiles/CppTest.dir/Father.cpp.o.requires:

.PHONY : CMakeFiles/CppTest.dir/Father.cpp.o.requires

CMakeFiles/CppTest.dir/Father.cpp.o.provides: CMakeFiles/CppTest.dir/Father.cpp.o.requires
	$(MAKE) -f CMakeFiles/CppTest.dir/build.make CMakeFiles/CppTest.dir/Father.cpp.o.provides.build
.PHONY : CMakeFiles/CppTest.dir/Father.cpp.o.provides

CMakeFiles/CppTest.dir/Father.cpp.o.provides.build: CMakeFiles/CppTest.dir/Father.cpp.o


CMakeFiles/CppTest.dir/test.cpp.o: CMakeFiles/CppTest.dir/flags.make
CMakeFiles/CppTest.dir/test.cpp.o: ../test.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/ckg/secnod/secnod/CppTest/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_3) "Building CXX object CMakeFiles/CppTest.dir/test.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/CppTest.dir/test.cpp.o -c /home/ckg/secnod/secnod/CppTest/test.cpp

CMakeFiles/CppTest.dir/test.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/CppTest.dir/test.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/ckg/secnod/secnod/CppTest/test.cpp > CMakeFiles/CppTest.dir/test.cpp.i

CMakeFiles/CppTest.dir/test.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/CppTest.dir/test.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/ckg/secnod/secnod/CppTest/test.cpp -o CMakeFiles/CppTest.dir/test.cpp.s

CMakeFiles/CppTest.dir/test.cpp.o.requires:

.PHONY : CMakeFiles/CppTest.dir/test.cpp.o.requires

CMakeFiles/CppTest.dir/test.cpp.o.provides: CMakeFiles/CppTest.dir/test.cpp.o.requires
	$(MAKE) -f CMakeFiles/CppTest.dir/build.make CMakeFiles/CppTest.dir/test.cpp.o.provides.build
.PHONY : CMakeFiles/CppTest.dir/test.cpp.o.provides

CMakeFiles/CppTest.dir/test.cpp.o.provides.build: CMakeFiles/CppTest.dir/test.cpp.o


CMakeFiles/CppTest.dir/testperson.cpp.o: CMakeFiles/CppTest.dir/flags.make
CMakeFiles/CppTest.dir/testperson.cpp.o: ../testperson.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/ckg/secnod/secnod/CppTest/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_4) "Building CXX object CMakeFiles/CppTest.dir/testperson.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/CppTest.dir/testperson.cpp.o -c /home/ckg/secnod/secnod/CppTest/testperson.cpp

CMakeFiles/CppTest.dir/testperson.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/CppTest.dir/testperson.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/ckg/secnod/secnod/CppTest/testperson.cpp > CMakeFiles/CppTest.dir/testperson.cpp.i

CMakeFiles/CppTest.dir/testperson.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/CppTest.dir/testperson.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/ckg/secnod/secnod/CppTest/testperson.cpp -o CMakeFiles/CppTest.dir/testperson.cpp.s

CMakeFiles/CppTest.dir/testperson.cpp.o.requires:

.PHONY : CMakeFiles/CppTest.dir/testperson.cpp.o.requires

CMakeFiles/CppTest.dir/testperson.cpp.o.provides: CMakeFiles/CppTest.dir/testperson.cpp.o.requires
	$(MAKE) -f CMakeFiles/CppTest.dir/build.make CMakeFiles/CppTest.dir/testperson.cpp.o.provides.build
.PHONY : CMakeFiles/CppTest.dir/testperson.cpp.o.provides

CMakeFiles/CppTest.dir/testperson.cpp.o.provides.build: CMakeFiles/CppTest.dir/testperson.cpp.o


CMakeFiles/CppTest.dir/smalltest.cpp.o: CMakeFiles/CppTest.dir/flags.make
CMakeFiles/CppTest.dir/smalltest.cpp.o: ../smalltest.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/ckg/secnod/secnod/CppTest/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_5) "Building CXX object CMakeFiles/CppTest.dir/smalltest.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/CppTest.dir/smalltest.cpp.o -c /home/ckg/secnod/secnod/CppTest/smalltest.cpp

CMakeFiles/CppTest.dir/smalltest.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/CppTest.dir/smalltest.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/ckg/secnod/secnod/CppTest/smalltest.cpp > CMakeFiles/CppTest.dir/smalltest.cpp.i

CMakeFiles/CppTest.dir/smalltest.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/CppTest.dir/smalltest.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/ckg/secnod/secnod/CppTest/smalltest.cpp -o CMakeFiles/CppTest.dir/smalltest.cpp.s

CMakeFiles/CppTest.dir/smalltest.cpp.o.requires:

.PHONY : CMakeFiles/CppTest.dir/smalltest.cpp.o.requires

CMakeFiles/CppTest.dir/smalltest.cpp.o.provides: CMakeFiles/CppTest.dir/smalltest.cpp.o.requires
	$(MAKE) -f CMakeFiles/CppTest.dir/build.make CMakeFiles/CppTest.dir/smalltest.cpp.o.provides.build
.PHONY : CMakeFiles/CppTest.dir/smalltest.cpp.o.provides

CMakeFiles/CppTest.dir/smalltest.cpp.o.provides.build: CMakeFiles/CppTest.dir/smalltest.cpp.o


CMakeFiles/CppTest.dir/enum.cpp.o: CMakeFiles/CppTest.dir/flags.make
CMakeFiles/CppTest.dir/enum.cpp.o: ../enum.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/ckg/secnod/secnod/CppTest/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_6) "Building CXX object CMakeFiles/CppTest.dir/enum.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/CppTest.dir/enum.cpp.o -c /home/ckg/secnod/secnod/CppTest/enum.cpp

CMakeFiles/CppTest.dir/enum.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/CppTest.dir/enum.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/ckg/secnod/secnod/CppTest/enum.cpp > CMakeFiles/CppTest.dir/enum.cpp.i

CMakeFiles/CppTest.dir/enum.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/CppTest.dir/enum.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/ckg/secnod/secnod/CppTest/enum.cpp -o CMakeFiles/CppTest.dir/enum.cpp.s

CMakeFiles/CppTest.dir/enum.cpp.o.requires:

.PHONY : CMakeFiles/CppTest.dir/enum.cpp.o.requires

CMakeFiles/CppTest.dir/enum.cpp.o.provides: CMakeFiles/CppTest.dir/enum.cpp.o.requires
	$(MAKE) -f CMakeFiles/CppTest.dir/build.make CMakeFiles/CppTest.dir/enum.cpp.o.provides.build
.PHONY : CMakeFiles/CppTest.dir/enum.cpp.o.provides

CMakeFiles/CppTest.dir/enum.cpp.o.provides.build: CMakeFiles/CppTest.dir/enum.cpp.o


CMakeFiles/CppTest.dir/typedefDataType.cpp.o: CMakeFiles/CppTest.dir/flags.make
CMakeFiles/CppTest.dir/typedefDataType.cpp.o: ../typedefDataType.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/ckg/secnod/secnod/CppTest/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_7) "Building CXX object CMakeFiles/CppTest.dir/typedefDataType.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/CppTest.dir/typedefDataType.cpp.o -c /home/ckg/secnod/secnod/CppTest/typedefDataType.cpp

CMakeFiles/CppTest.dir/typedefDataType.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/CppTest.dir/typedefDataType.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/ckg/secnod/secnod/CppTest/typedefDataType.cpp > CMakeFiles/CppTest.dir/typedefDataType.cpp.i

CMakeFiles/CppTest.dir/typedefDataType.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/CppTest.dir/typedefDataType.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/ckg/secnod/secnod/CppTest/typedefDataType.cpp -o CMakeFiles/CppTest.dir/typedefDataType.cpp.s

CMakeFiles/CppTest.dir/typedefDataType.cpp.o.requires:

.PHONY : CMakeFiles/CppTest.dir/typedefDataType.cpp.o.requires

CMakeFiles/CppTest.dir/typedefDataType.cpp.o.provides: CMakeFiles/CppTest.dir/typedefDataType.cpp.o.requires
	$(MAKE) -f CMakeFiles/CppTest.dir/build.make CMakeFiles/CppTest.dir/typedefDataType.cpp.o.provides.build
.PHONY : CMakeFiles/CppTest.dir/typedefDataType.cpp.o.provides

CMakeFiles/CppTest.dir/typedefDataType.cpp.o.provides.build: CMakeFiles/CppTest.dir/typedefDataType.cpp.o


CMakeFiles/CppTest.dir/ref.cpp.o: CMakeFiles/CppTest.dir/flags.make
CMakeFiles/CppTest.dir/ref.cpp.o: ../ref.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/ckg/secnod/secnod/CppTest/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_8) "Building CXX object CMakeFiles/CppTest.dir/ref.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/CppTest.dir/ref.cpp.o -c /home/ckg/secnod/secnod/CppTest/ref.cpp

CMakeFiles/CppTest.dir/ref.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/CppTest.dir/ref.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/ckg/secnod/secnod/CppTest/ref.cpp > CMakeFiles/CppTest.dir/ref.cpp.i

CMakeFiles/CppTest.dir/ref.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/CppTest.dir/ref.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/ckg/secnod/secnod/CppTest/ref.cpp -o CMakeFiles/CppTest.dir/ref.cpp.s

CMakeFiles/CppTest.dir/ref.cpp.o.requires:

.PHONY : CMakeFiles/CppTest.dir/ref.cpp.o.requires

CMakeFiles/CppTest.dir/ref.cpp.o.provides: CMakeFiles/CppTest.dir/ref.cpp.o.requires
	$(MAKE) -f CMakeFiles/CppTest.dir/build.make CMakeFiles/CppTest.dir/ref.cpp.o.provides.build
.PHONY : CMakeFiles/CppTest.dir/ref.cpp.o.provides

CMakeFiles/CppTest.dir/ref.cpp.o.provides.build: CMakeFiles/CppTest.dir/ref.cpp.o


CMakeFiles/CppTest.dir/swap.cpp.o: CMakeFiles/CppTest.dir/flags.make
CMakeFiles/CppTest.dir/swap.cpp.o: ../swap.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/ckg/secnod/secnod/CppTest/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_9) "Building CXX object CMakeFiles/CppTest.dir/swap.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/CppTest.dir/swap.cpp.o -c /home/ckg/secnod/secnod/CppTest/swap.cpp

CMakeFiles/CppTest.dir/swap.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/CppTest.dir/swap.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/ckg/secnod/secnod/CppTest/swap.cpp > CMakeFiles/CppTest.dir/swap.cpp.i

CMakeFiles/CppTest.dir/swap.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/CppTest.dir/swap.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/ckg/secnod/secnod/CppTest/swap.cpp -o CMakeFiles/CppTest.dir/swap.cpp.s

CMakeFiles/CppTest.dir/swap.cpp.o.requires:

.PHONY : CMakeFiles/CppTest.dir/swap.cpp.o.requires

CMakeFiles/CppTest.dir/swap.cpp.o.provides: CMakeFiles/CppTest.dir/swap.cpp.o.requires
	$(MAKE) -f CMakeFiles/CppTest.dir/build.make CMakeFiles/CppTest.dir/swap.cpp.o.provides.build
.PHONY : CMakeFiles/CppTest.dir/swap.cpp.o.provides

CMakeFiles/CppTest.dir/swap.cpp.o.provides.build: CMakeFiles/CppTest.dir/swap.cpp.o


CMakeFiles/CppTest.dir/eryi.cpp.o: CMakeFiles/CppTest.dir/flags.make
CMakeFiles/CppTest.dir/eryi.cpp.o: ../eryi.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/ckg/secnod/secnod/CppTest/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_10) "Building CXX object CMakeFiles/CppTest.dir/eryi.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/CppTest.dir/eryi.cpp.o -c /home/ckg/secnod/secnod/CppTest/eryi.cpp

CMakeFiles/CppTest.dir/eryi.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/CppTest.dir/eryi.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/ckg/secnod/secnod/CppTest/eryi.cpp > CMakeFiles/CppTest.dir/eryi.cpp.i

CMakeFiles/CppTest.dir/eryi.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/CppTest.dir/eryi.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/ckg/secnod/secnod/CppTest/eryi.cpp -o CMakeFiles/CppTest.dir/eryi.cpp.s

CMakeFiles/CppTest.dir/eryi.cpp.o.requires:

.PHONY : CMakeFiles/CppTest.dir/eryi.cpp.o.requires

CMakeFiles/CppTest.dir/eryi.cpp.o.provides: CMakeFiles/CppTest.dir/eryi.cpp.o.requires
	$(MAKE) -f CMakeFiles/CppTest.dir/build.make CMakeFiles/CppTest.dir/eryi.cpp.o.provides.build
.PHONY : CMakeFiles/CppTest.dir/eryi.cpp.o.provides

CMakeFiles/CppTest.dir/eryi.cpp.o.provides.build: CMakeFiles/CppTest.dir/eryi.cpp.o


CMakeFiles/CppTest.dir/c516/Person.cpp.o: CMakeFiles/CppTest.dir/flags.make
CMakeFiles/CppTest.dir/c516/Person.cpp.o: ../c516/Person.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/ckg/secnod/secnod/CppTest/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_11) "Building CXX object CMakeFiles/CppTest.dir/c516/Person.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/CppTest.dir/c516/Person.cpp.o -c /home/ckg/secnod/secnod/CppTest/c516/Person.cpp

CMakeFiles/CppTest.dir/c516/Person.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/CppTest.dir/c516/Person.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/ckg/secnod/secnod/CppTest/c516/Person.cpp > CMakeFiles/CppTest.dir/c516/Person.cpp.i

CMakeFiles/CppTest.dir/c516/Person.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/CppTest.dir/c516/Person.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/ckg/secnod/secnod/CppTest/c516/Person.cpp -o CMakeFiles/CppTest.dir/c516/Person.cpp.s

CMakeFiles/CppTest.dir/c516/Person.cpp.o.requires:

.PHONY : CMakeFiles/CppTest.dir/c516/Person.cpp.o.requires

CMakeFiles/CppTest.dir/c516/Person.cpp.o.provides: CMakeFiles/CppTest.dir/c516/Person.cpp.o.requires
	$(MAKE) -f CMakeFiles/CppTest.dir/build.make CMakeFiles/CppTest.dir/c516/Person.cpp.o.provides.build
.PHONY : CMakeFiles/CppTest.dir/c516/Person.cpp.o.provides

CMakeFiles/CppTest.dir/c516/Person.cpp.o.provides.build: CMakeFiles/CppTest.dir/c516/Person.cpp.o


# Object files for target CppTest
CppTest_OBJECTS = \
"CMakeFiles/CppTest.dir/main.cpp.o" \
"CMakeFiles/CppTest.dir/Father.cpp.o" \
"CMakeFiles/CppTest.dir/test.cpp.o" \
"CMakeFiles/CppTest.dir/testperson.cpp.o" \
"CMakeFiles/CppTest.dir/smalltest.cpp.o" \
"CMakeFiles/CppTest.dir/enum.cpp.o" \
"CMakeFiles/CppTest.dir/typedefDataType.cpp.o" \
"CMakeFiles/CppTest.dir/ref.cpp.o" \
"CMakeFiles/CppTest.dir/swap.cpp.o" \
"CMakeFiles/CppTest.dir/eryi.cpp.o" \
"CMakeFiles/CppTest.dir/c516/Person.cpp.o"

# External object files for target CppTest
CppTest_EXTERNAL_OBJECTS =

CppTest: CMakeFiles/CppTest.dir/main.cpp.o
CppTest: CMakeFiles/CppTest.dir/Father.cpp.o
CppTest: CMakeFiles/CppTest.dir/test.cpp.o
CppTest: CMakeFiles/CppTest.dir/testperson.cpp.o
CppTest: CMakeFiles/CppTest.dir/smalltest.cpp.o
CppTest: CMakeFiles/CppTest.dir/enum.cpp.o
CppTest: CMakeFiles/CppTest.dir/typedefDataType.cpp.o
CppTest: CMakeFiles/CppTest.dir/ref.cpp.o
CppTest: CMakeFiles/CppTest.dir/swap.cpp.o
CppTest: CMakeFiles/CppTest.dir/eryi.cpp.o
CppTest: CMakeFiles/CppTest.dir/c516/Person.cpp.o
CppTest: CMakeFiles/CppTest.dir/build.make
CppTest: CMakeFiles/CppTest.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/home/ckg/secnod/secnod/CppTest/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_12) "Linking CXX executable CppTest"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/CppTest.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/CppTest.dir/build: CppTest

.PHONY : CMakeFiles/CppTest.dir/build

CMakeFiles/CppTest.dir/requires: CMakeFiles/CppTest.dir/main.cpp.o.requires
CMakeFiles/CppTest.dir/requires: CMakeFiles/CppTest.dir/Father.cpp.o.requires
CMakeFiles/CppTest.dir/requires: CMakeFiles/CppTest.dir/test.cpp.o.requires
CMakeFiles/CppTest.dir/requires: CMakeFiles/CppTest.dir/testperson.cpp.o.requires
CMakeFiles/CppTest.dir/requires: CMakeFiles/CppTest.dir/smalltest.cpp.o.requires
CMakeFiles/CppTest.dir/requires: CMakeFiles/CppTest.dir/enum.cpp.o.requires
CMakeFiles/CppTest.dir/requires: CMakeFiles/CppTest.dir/typedefDataType.cpp.o.requires
CMakeFiles/CppTest.dir/requires: CMakeFiles/CppTest.dir/ref.cpp.o.requires
CMakeFiles/CppTest.dir/requires: CMakeFiles/CppTest.dir/swap.cpp.o.requires
CMakeFiles/CppTest.dir/requires: CMakeFiles/CppTest.dir/eryi.cpp.o.requires
CMakeFiles/CppTest.dir/requires: CMakeFiles/CppTest.dir/c516/Person.cpp.o.requires

.PHONY : CMakeFiles/CppTest.dir/requires

CMakeFiles/CppTest.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/CppTest.dir/cmake_clean.cmake
.PHONY : CMakeFiles/CppTest.dir/clean

CMakeFiles/CppTest.dir/depend:
	cd /home/ckg/secnod/secnod/CppTest/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/ckg/secnod/secnod/CppTest /home/ckg/secnod/secnod/CppTest /home/ckg/secnod/secnod/CppTest/cmake-build-debug /home/ckg/secnod/secnod/CppTest/cmake-build-debug /home/ckg/secnod/secnod/CppTest/cmake-build-debug/CMakeFiles/CppTest.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/CppTest.dir/depend

